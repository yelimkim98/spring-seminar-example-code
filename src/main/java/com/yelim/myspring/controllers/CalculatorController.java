package com.yelim.myspring.controllers;

import com.yelim.myspring.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // 클래스가 컨트롤러 역할을 하게 함
@RequestMapping("/calculator") // calculator라는 경로가 붙으면 이 컨트롤러에서 처리
public class CalculatorController {

    // 컨트롤러와 서비스를 나누는 부분!
    @Autowired // 서비스로 인정된 애를 자동으로 가져와서 쓰겠다
    private CalculatorService calculatorService;
    // 컨트롤러가 만들어질 때
    // 서비스라는 애를 통해서....
    // 객체를 가져와서 주입시켜준다

    @RequestMapping("/add")
    public int add(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calculatorService.add(num1, num2);
    }

    @RequestMapping("/subtract")
    public int subtract(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return calculatorService.subtract(num1, num2);
    }

    @RequestMapping("/multiple")
    public int multiple(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1*num2;
    }

    @RequestMapping("/divide")
    public int divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1/num2;
    }

    @RequestMapping("/modular")
    public int modular(@RequestParam("num1") int num1, @RequestParam("num2") int num2){
        return num1%num2;
    }
}