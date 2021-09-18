package cn.duktig.proxypattern.mybatis.mapper;

import cn.duktig.proxypattern.mybatis.annotation.Select;

/**
 * description:
 *
 * @author RenShiWei
 * Date: 2021/9/18 20:05
 * blog: https://duktig.cn/
 * github知识库: https://github.com/duktig666/knowledge
 **/
public interface UserMapper {

    /**
     * 查询用户信息
     */
    @Select("select userName from user where id = #{uId}")
    String queryUserInfo(String uId);

}
