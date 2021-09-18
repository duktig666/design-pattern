package cn.duktig.proxypattern.define.dynamic.cglibproxy;

/**
 * description: Cglib 代理的真实对象（无需实现接口，但类不能是final）
 *
 * @author RenShiWei
 * Date: 2021/9/18 17:48
 * blog: https://duktig.cn/
 * github知识库: https://github.com/duktig666/knowledge
 **/
public class CglibDynamicRealSubject {

    public void request() {
        System.out.println("访问真实主题方法...");
    }

}

