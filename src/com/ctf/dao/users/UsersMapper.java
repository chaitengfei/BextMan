package com.ctf.dao.users;

import com.ctf.entity.Users;import org.apache.ibatis.annotations.Param;

public interface UsersMapper {

    /**
     * A．登录所需的查询
     * B．查询所有商品
     * C．查询指定商品的库存
     * D．修改指定商品的库存
     * E．添加销售记录
     * F．对销售记录按指定的排序规则分页查询
     */


    //通过userName 查询user
    Users getUsers(@Param("userName") String userName, @Param("password")String password);

}
