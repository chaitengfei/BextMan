package com.ctf.service.users;

import com.ctf.dao.users.UsersMapper;
import com.ctf.entity.Users;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
@Transactional
public class UsersServiceImpl implements UsersService {

    @Resource
    private UsersMapper usersMapper;

    @Override
    public Users getUsers(String userName,String password) {

        return usersMapper.getUsers(userName,password);
    }
}
