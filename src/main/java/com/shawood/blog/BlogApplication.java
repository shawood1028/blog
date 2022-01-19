package com.shawood.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shawood
 */

/**
 * shawood 博客主页面
 */
@SpringBootApplication
@RestController
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class, args);
    }

    @GetMapping("/index")
    public String hello(@RequestParam(value = "name" , defaultValue = "Shawood") String name){
        return  String.format("Hello %s!",name);
    }

}
