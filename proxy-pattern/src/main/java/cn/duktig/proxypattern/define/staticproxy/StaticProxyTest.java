package cn.duktig.proxypattern.define.staticproxy;

/**
 * description: 代理模式测试，实现对真实对象方法的增强（前置和后置处理）
 *
 * @author RenShiWei
 * Date: 2021/9/18 16:13
 * blog: https://duktig.cn/
 * github知识库: https://github.com/duktig666/knowledge
 **/
public class StaticProxyTest {

    public static void main(String[] args) {
        StaticProxy staticProxy = new StaticProxy(new StaticRealSubject());
        staticProxy.request();
    }

}

