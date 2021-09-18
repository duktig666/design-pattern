package cn.duktig.proxypattern.define.dynamic.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

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
public class JdkDynamicProxyFactory {

    /** 维护一个真实对象 , Object */
    private Object target;

    /** 代理对象的处理逻辑 */
    InvocationHandler invocationHandler;

    public JdkDynamicProxyFactory(Object target, InvocationHandler invocationHandler) {
        this.target = target;
        this.invocationHandler = invocationHandler;
    }

    /**
     * 代理对象和真实对象都需要执行的抽象方法
     */
    //给目标对象 生成一个代理对象
    public Object getProxyInstance() {
		/* 说明
		 *  public static Object newProxyInstance(ClassLoader loader,
                                          Class<?>[] interfaces,
                                          InvocationHandler h)

            1. ClassLoader loader ： 指定当前目标对象使用的类加载器, 获取加载器的方法固定
            2. Class<?>[] interfaces: 目标对象实现的接口类型，使用泛型方法确认类型
            3. InvocationHandler h : 事情处理，执行目标对象的方法时，会触发事情处理器方法,
            * 会把当前执行的目标对象方法作为参数传入。这里可以使用匿名调用，也可以重新实例化一个类来使用（这个类需要实现InvocationHandler接口，重写invoke方法即可）
		 */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                invocationHandler);
    }

}

