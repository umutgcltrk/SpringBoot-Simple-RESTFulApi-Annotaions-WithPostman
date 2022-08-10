package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api3")
public class RequestParamTest {
    /* @RequestParam annatasyonu kullanıcıdan veri aldığımız annatasyonlardan biridir. */

    @GetMapping(path = "/requestparam")
    public String getMyMessage(@RequestParam String message){
        return "Your message id :"+message;
    }
    //http://localhost:8080/api3/requestparam?message=Mesajım buradaa :D
}
