package cn.duktig.proxypattern.mybatis.annotation;

import java.lang.annotation.*;

/**
 * description: mybatis 查询注解
 *
 * @author RenShiWei
 * Date: 2021/9/18 20:02
 * blog: https://duktig.cn/
 * github知识库: https://github.com/duktig666/knowledge
 **/
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Select {

    /**
     * sql语句
     */
    String value() default "";

}
