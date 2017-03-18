package com.crm.controller;

<<<<<<< HEAD
import com.crm.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
=======
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
>>>>>>> b608f21ea311e18cbf46fdcacd840503d85dbe4d

@Controller
public class HomeController {


    /**
     * 登录页面
     * @return
     */
    @GetMapping("/")
<<<<<<< HEAD
    public String login(){
        return "login";
    }

    @GetMapping("/home")
    public String home(User user){
        return "home";
    }
=======
    public String list(){
        return "login";
    }

>>>>>>> b608f21ea311e18cbf46fdcacd840503d85dbe4d
}
