package com.yelim.myspring.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int add(int num1, int num2){
        return num1+num2;
    }

    public int subtract(int num1, int num2){
        return num1-num2;
    }
}