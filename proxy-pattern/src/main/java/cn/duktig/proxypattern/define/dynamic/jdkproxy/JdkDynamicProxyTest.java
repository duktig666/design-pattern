package cn.duktig.proxypattern.define.dynamic.jdkproxy;

import cn.duktig.proxypattern.define.Subject;

import java.lang.reflect.InvocationHandler;

/**
 * description: jdk动态代理模式测试，实现对真实对象方法的增强（前置和后置处理）
 *
 * @author RenShiWei
 * Date: 2021/9/18 16:13
 * blog: https://duktig.cn/
 * github知识库: https://github.com/duktig666/knowledge
 **/
public class JdkDynamicProxyTest {

    public static void main(String[] args) {
        Subject target = new JdkDynamicRealSubject();
        // 代理对象的处理逻辑
        InvocationHandler myInvocationHandler = new MyInvocationHandler(target);
        Subject proxyInstance = (Subject) new JdkDynamicProxyFactory(target, myInvocationHandler).getProxyInstance();

        // proxyInstance=class com.sun.proxy.$Proxy0 内存中动态生成了代理对象
        System.out.println("proxyInstance=" + proxyInstance.getClass());

        //通过代理对象，调用目标对象的方法
        proxyInstance.request();
    }

}

