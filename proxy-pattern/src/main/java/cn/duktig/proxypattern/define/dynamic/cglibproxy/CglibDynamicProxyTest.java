package cn.duktig.proxypattern.define.dynamic.cglibproxy;

import net.sf.cglib.proxy.MethodInterceptor;

/**
 * description: jdk动态代理模式测试，实现对真实对象方法的增强（前置和后置处理）
 *
 * @author RenShiWei
 * Date: 2021/9/18 16:13
 * blog: https://duktig.cn/
 * github知识库: https://github.com/duktig666/knowledge
 **/
public class CglibDynamicProxyTest {

    public static void main(String[] args) {
        CglibDynamicRealSubject target = new CglibDynamicRealSubject();
        // 代理对象的处理逻辑
        MethodInterceptor methodInterceptor = new MyMethodInterceptor(target);
        CglibDynamicRealSubject proxyInstance = (CglibDynamicRealSubject) new CglibDynamicProxyFactory(target,
                methodInterceptor).getProxyInstance();

        System.out.println("proxyInstance=" + proxyInstance.getClass());

        // 通过代理对象，调用目标对象的方法
        proxyInstance.request();
    }

}

