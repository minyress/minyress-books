package com.minyress.controller;

import com.minyress.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by limingyang on 2017/4/13.
 */
@Controller
@RequestMapping("/logging")
public class LoggingController {

    /**
     * http://localhost:8080/minyress/logging/selectLogById.action
     * @return
     */
    @RequestMapping("/selectLogById")
    @ResponseBody
    public User exportjson() {
        User user = new User();
        user.setUsername("minyress log 哈哈");
        return user;
    }

    @RequestMapping("/hahaha")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index"); //视图名称
        mv.addObject("msg","SpirngMVC hello world!");
        return mv;
    }

}
