package com.javaitem.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: wiki
 * @description: 接口
 * @author: CaoHaiyang
 * @create: 2023-03-21 17:23
 **/
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @PostMapping("/hello/post")
    public String hellopost(String name){
        return "helloPost" + name;
    }

}
