package cn.duktig.proxypattern.define.dynamic.cglibproxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * description: Cglib代理对象执行的逻辑
 *
 * @author RenShiWei
 * Date: 2021/9/18 17:54
 * blog: https://duktig.cn/
 * github知识库: https://github.com/duktig666/knowledge
 **/
public class MyMethodInterceptor implements MethodInterceptor {

    /** 维护一个真实对象 , Object */
    private Object target;

    public MyMethodInterceptor(Object target) {
        this.target = target;
    }

    /**
     * 重写  intercept 方法，会调用目标对象的方法
     */
    @Override
    public Object intercept(Object arg0, Method method, Object[] args, MethodProxy arg3) throws Throwable {
        System.out.println("Cglib代理 访问真实主题之前的预处理。");
        Object returnVal = method.invoke(target, args);
        System.out.println("Cglib代理 访问真实主题之前的预处理。");
        return returnVal;
    }

}

