package cn.duktig.proxypattern.define.dynamic.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

/**
 * description: 代理对象
 * <p>
 * 两个作用：
 * 1. 屏蔽（保护）真实对象
 * 2. 增强真实对象执行的方法
 *
 * @author RenShiWei
 * Date: 2021/9/18 16:08
 * blog: https://duktig.cn/
 * github知识库: https://github.com/duktig666/knowledge
 **/
public class CglibDynamicProxyFactory {

    /** 维护一个真实对象 , Object */
    private Object target;

    /** 代理对象的业务处理逻辑类 */
    private MethodInterceptor methodInterceptor;

    public CglibDynamicProxyFactory(Object target, MethodInterceptor methodInterceptor) {
        this.target = target;
        this.methodInterceptor = methodInterceptor;
    }

    /**
     * 返回一个代理对象:  是 target 对象的代理对象
     *
     * @return 动态构建真实对象的子类 作为 代理对象
     */
    public Object getProxyInstance() {
        //1. 创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2. 设置父类
        enhancer.setSuperclass(target.getClass());
        //3. 设置回调函数
        enhancer.setCallback(methodInterceptor);
        //4. 创建子类对象，即代理对象
        return enhancer.create();
    }

}

