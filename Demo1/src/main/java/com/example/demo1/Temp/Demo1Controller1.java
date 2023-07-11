package com.example.demo1.Temp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Demo1Controller1 {
    @RequestMapping("home")
    public String home(){
        return "home";
    }
    @RequestMapping("profile")
    public String profile(){
        return "profile";

    }
}


