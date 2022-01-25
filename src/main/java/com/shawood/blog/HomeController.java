package com.shawood.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author shawood
 */

//  博客主页

@Controller
public class HomeController {

    // 处理对根路径"/"的请求

    @GetMapping("/")
    public String home(){
        // 返回视图名

        return "home";
    }
}
