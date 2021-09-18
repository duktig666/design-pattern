package cn.duktig.proxypattern.mybatis.support;

import cn.duktig.proxypattern.mybatis.annotation.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

/**
 * description: 定义bean 自定义实现注册流程
 *
 * @author RenShiWei
 * Date: 2021/9/18 20:07
 * blog: https://duktig.cn/
 * github知识库: https://github.com/duktig666/knowledge
 **/
public class MapperFactoryBean<T> implements FactoryBean<T> {

    private Logger logger = LoggerFactory.getLogger(MapperFactoryBean.class);

    /** 需要代理的 mapper 接口 */
    private Class<T> mapperInterface;

    public MapperFactoryBean(Class<T> mapperInterface) {
        this.mapperInterface = mapperInterface;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T getObject() {
        return (T) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[] {mapperInterface},
                (proxy, method, args) -> {
                    Select select = method.getAnnotation(Select.class);
                    logger.info("SQL：{}", select.value().replace("#{uId}", args[0].toString()));
                    return args[0] + ",duktig666！";
                });
    }

    @Override
    public Class<?> getObjectType() {
        return mapperInterface;
    }

}

