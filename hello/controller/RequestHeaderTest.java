package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api6")
public class RequestHeaderTest {

    @GetMapping(path = "/header")
    public String getHeader(@RequestHeader("My-Header") String myHeader){
        return "Your header is : "+myHeader;
    }
}
