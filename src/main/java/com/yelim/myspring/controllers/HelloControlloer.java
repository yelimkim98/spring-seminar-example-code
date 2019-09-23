package com.yelim.myspring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 이 클래스가 컨트롤러 역할을 한다는 뜻
@RequestMapping("/")
public class HelloControlloer {

    @RequestMapping("hi")
    public String hello(){
        return "Hello, World";
    }

    @RequestMapping("hi/hello")
    public String hello2(){
        return "Hello, World 2222";
    }
}