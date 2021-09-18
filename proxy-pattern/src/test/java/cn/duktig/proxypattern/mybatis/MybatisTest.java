package cn.duktig.proxypattern.mybatis;

import cn.duktig.proxypattern.mybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * description: 测试使用动态代理 实现mybatis 的注解查询
 *
 * @author RenShiWei
 * Date: 2021/9/18 20:21
 * blog: https://duktig.cn/
 * github知识库: https://github.com/duktig666/knowledge
 **/
@SpringBootTest
public class MybatisTest {

    @Test
    public void testUserMapper() {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("spring-config.xml");
        UserMapper userDao = beanFactory.getBean("userMapper", UserMapper.class);
        String res = userDao.queryUserInfo("100001");
        System.out.println("测试结果：" + res);
    }

}

