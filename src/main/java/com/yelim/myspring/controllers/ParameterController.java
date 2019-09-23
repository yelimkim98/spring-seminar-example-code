package com.yelim.myspring.controllers;

import com.yelim.myspring.models.Member;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/params")
public class ParameterController {
    // query로 받는 방식
    @GetMapping("/query")
    public String query(@RequestParam String query, @RequestParam int page){
        return "[Query]" +
                "query : " + query + "\n" +
                "page : " + page;
    }

    // path
    //path variable : 경로상에 있는 변수
    // /path/검색어를 입력해주세요/2
    @GetMapping("/path/{query}/{page}")
    public String path(@PathVariable String query, @RequestParam int page){
        return "[Path Variable]" + "\n" +
                "query : " + query + "\n" +
                "page : " + page;
    }
    // body
    @PostMapping("/body")
    public String body(@RequestBody Member member){
        return "[Request Body]" + "\n" +
                "ID : " + member.getId() + "\n" +
                "NAME : " + member.getName() + "\n";
    }
}