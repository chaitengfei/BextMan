package com.ctf.controller;


import com.ctf.entity.Users;
import com.ctf.service.users.UsersService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/dev")
public class UsersController {

    @Resource
    private UsersService usersService;
    private Logger logger = Logger.getLogger(UsersController.class);

    @RequestMapping("/main")
    public String toMain(){
        return "developer/main";
    }

    @RequestMapping(value = "/login")
    public String Login(){
        logger.debug("我进入了LginController");
        return "devlogin";
    }
    @RequestMapping("/dologin")
    public String doDevLogin(HttpServletRequest request, @RequestParam String userName ,@RequestParam String password){
        System.out.println(userName);
        Users user = usersService.getUsers(userName,password);

        if(user == null){
            request.setAttribute("error","用户名或密码错误");
            return "redirect:/403.jsp";
        }
        request.getSession().setAttribute("LoginUser",user);
        return "redirect:/dev/main";
    }
    @RequestMapping("/logout")
    public String loginOut(){
        return "redirect:/index.jsp";
    }
}
