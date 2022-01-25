package com.shawood.blog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author shawood
 */


// 后台登录页面

@Slf4j
@Controller

public class LoginController {
//    处理登录请求

    @GetMapping("/Login")
    public String AdminLogin(){
        return "Login";
    }
}
