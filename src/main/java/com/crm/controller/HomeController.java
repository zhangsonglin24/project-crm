package com.crm.controller;


import com.crm.Service.UserService;
import com.crm.pojo.User;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;


@Controller
public class HomeController {

    @Autowired
    private UserService userService;
    /**
     * 登录页面
     * @return
     */
    @GetMapping("/")
    public String login(){
        return "login";
    }

    @PostMapping("/")
    public String login(String username, String password, RedirectAttributes redirectAttributes, HttpServletRequest request){
        /*shiro方式登录*/
        Subject subject= SecurityUtils.getSubject();
        try{
            subject.login(new UsernamePasswordToken(username, DigestUtils.md5Hex(password)));

            /*获取登录的IP*/
            userService.saveUserLogin(request.getRemoteAddr());

            return "redirect:/home";
        }catch (AuthenticationException ex){
            ex.printStackTrace();

            return "redirect:/";
        }

    }


    @GetMapping("/home")
    public String home(){
        return "home";
    }

}
