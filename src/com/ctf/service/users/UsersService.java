package com.ctf.service.users;

import com.ctf.entity.Users;
import org.apache.ibatis.annotations.Param;

public interface UsersService {

    //通过userName 查询user
    Users getUsers(@Param("userName") String userName, @Param("password")String password);

}
