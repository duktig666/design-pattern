package cn.duktig.proxypattern.define;

/**
 * description:抽象主题
 *
 * @author RenShiWei
 * Date: 2021/9/18 16:05
 * blog: https://duktig.cn/
 * github知识库: https://github.com/duktig666/knowledge
 **/
public interface Subject {

    /**
     * 代理对象和真实对象都需要执行的抽象方法
     */
    void request();

}
