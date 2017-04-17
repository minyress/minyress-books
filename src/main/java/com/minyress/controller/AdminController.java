package com.minyress.controller;

import com.minyress.bean.User;
import com.minyress.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by admin on 2017/4/13.
 */
@RequestMapping("/admin")
@Controller
public class AdminController {

    @Autowired
    private UserService userService;

    @RequestMapping("/selectUserById")
    @ResponseBody
    public User exportjson(String userId) {
        User user = userService.getUserById(userId);
        return user;
    }




}
