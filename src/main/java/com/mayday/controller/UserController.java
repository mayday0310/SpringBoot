package com.mayday.controller;

import com.mayday.model.User;
import com.mayday.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zl on 2015/8/27.
 */
@Controller
@RequestMapping(value="/main")
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);


    @Autowired
    private UserService userService;

     @RequestMapping(value="index")
    public String index(){
        System.out.println("进入index方法");
        return "index";
    }

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo() {
        User user = userService.getUserInfo();
        if(user!=null){
            System.out.println("user.getName():"+user.getName());
            logger.info("user.getAge():"+user.getAge());
        }
        return user;
    }
}
