package com.mafh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author mafh
 * @create 2017-07-31 15:00
 * Created With Intellij IDEA
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    Logger logger = LoggerFactory.getLogger(LoginController.class);
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String view(){
        return "login/login";
    }

    @RequestMapping(value = "/doLogin",method = RequestMethod.POST)
    public ModelAndView login(String name,String password){
        ModelAndView mv = new ModelAndView();
        logger.info("进入了控制器的login方法");
        logger.info("name="+name);
        logger.info("password="+password);
        mv.setViewName("login/hello");
        mv.addObject("msg","这里是controller方法");
        return mv;
    }
}
