package com.crm.controller;


import com.crm.service.UserService;
import com.crm.util.ServletUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.LockedAccountException;
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
           // subject.login(new UsernamePasswordToken(username, DigestUtils.md5Hex(password)));
            subject.login(new UsernamePasswordToken(username,password));
            /*获取登录的IP*/
            userService.saveUserLogin(ServletUtil.getRemoteIp(request));

            return "redirect:/home";
        }catch (LockedAccountException ex){
           redirectAttributes.addFlashAttribute("message", new FlashMessage(FlashMessage.STATE_ERROR,"账号被禁用"));

        }catch (AuthenticationException exception){
            redirectAttributes.addFlashAttribute("message",new FlashMessage(FlashMessage.STATE_ERROR,"账号或密码错误"));
        }
        return "redirect:/";
    }


    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/logout")
    public String logout(RedirectAttributes redirectAttributes){
      SecurityUtils.getSubject().logout();
       redirectAttributes.addFlashAttribute("message",new FlashMessage("你以安全退出"));
        return "redirect:/";
    }

    @GetMapping("/403")
    public String error403(){
        return "403";
    }
}
