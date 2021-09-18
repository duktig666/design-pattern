package cn.duktig.proxypattern.define.dynamic.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * description: 代理逻辑处理类
 *
 * @author RenShiWei
 * Date: 2021/9/18 17:08
 * blog: https://duktig.cn/
 * github知识库: https://github.com/duktig666/knowledge
 **/
public class MyInvocationHandler implements InvocationHandler {

    /** 维护一个真实对象 , Object */
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        System.out.println("JDK代理 访问真实主题之前的预处理。");
        //反射机制调用目标对象的方法
        Object returnVal = null;
        try {
            returnVal = method.invoke(target, args);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println("JDK代理 访问真实主题之后的后续处理。");
        return returnVal;
    }

}

