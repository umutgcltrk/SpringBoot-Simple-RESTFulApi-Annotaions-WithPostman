package com.example.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api4")
public class RequiredTest {

    @GetMapping(path = {"/message1","/message1/{message}"}) //birden fazla path vermek için "{}" ve pathlarin arasına ",".
    public String getMyMessageWithPathVeriable(@PathVariable(name = "message",required = false) String message){
        return "Your message is :"+message;
    }

    @GetMapping(path = "/message2")
    public String getMyMessageWithParam(@RequestParam(name = "message",required = false,defaultValue = "default mesaj") String message){
        return "Your message is :" + message;
    }
}
