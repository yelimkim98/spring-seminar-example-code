package com.yelim.myspring.services;

import org.springframework.stereotype.Service;

@Service
public class StringService {

    public String append(String s1, String s2) {
        return s1 + s2;
    }

    public boolean equals(String s1, String s2) {
        return s1.equals(s2) ? true : false;
    }

    public int length(String s) {
        return s.length();
    }

    public char charAt(String s, int idx) {
        return s.charAt(idx);
    }
}