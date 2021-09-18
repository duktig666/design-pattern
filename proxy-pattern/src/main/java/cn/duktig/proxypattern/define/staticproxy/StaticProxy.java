package cn.duktig.proxypattern.define.staticproxy;

import cn.duktig.proxypattern.define.Subject;

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
public class StaticProxy implements Subject {

    private StaticRealSubject staticRealSubject;

    public StaticProxy(StaticRealSubject staticRealSubject) {
        this.staticRealSubject = staticRealSubject;
    }

    /**
     * 代理对象和真实对象都需要执行的抽象方法
     */
    @Override
    public void request() {
        this.preRequest();
        staticRealSubject.request();
        this.postRequest();
    }

    /**
     * 代理对象，前置执行方法
     */
    public void preRequest() {
        System.out.println("访问真实主题之前的预处理。");
    }

    /**
     * 代理对象，后置执行方法
     */
    public void postRequest() {
        System.out.println("访问真实主题之后的后续处理。");
    }

}

