package com.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    /**
     * 登录页面
     * @return
     */
    @GetMapping("/")
    public String list(){
        return "login";
    }

}
