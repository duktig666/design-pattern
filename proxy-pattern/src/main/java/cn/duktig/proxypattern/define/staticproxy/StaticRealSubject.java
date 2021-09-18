package cn.duktig.proxypattern.define.staticproxy;

import cn.duktig.proxypattern.define.Subject;

/**
 * description: 真实对象
 *
 * @author RenShiWei
 * Date: 2021/9/18 16:06
 * blog: https://duktig.cn/
 * github知识库: https://github.com/duktig666/knowledge
 **/
public class StaticRealSubject implements Subject {

    /**
     * 真实对象执行的方法
     */
    @Override
    public void request() {
        System.out.println("访问真实主题方法...");
    }

}

