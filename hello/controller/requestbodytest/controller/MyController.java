package com.example.hello.controller.requestbodytest.controller;

import com.example.hello.controller.requestbodytest.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api5")
public class MyController {

    @PostMapping(path = "/users")
    public User saveUser(@RequestBody User user){
        System.out.println("User Saved !");
        user.setPassword("");//password bilgisini göstermemek için
        return user;
    }

    //Biden fazla user göndermek için
    @PostMapping(path = "/users-all")
    public List<User> saveAllUser(@RequestBody List<User> users){
        System.out.println("All Saved !");

        users.forEach(user -> user.setPassword("")); //List olduğu için foreach kullandık lambda ile .
        return users;
    }

    /*"@RequestBody" annatasyonu kullanıcından veri aldığımız annatasyonlardan birisi .
    * Diğerlerinden farklı şekilde (PathVeriable,RequestParam) kullanıcıdan "obje" şeklinde veri alabildiğimiz,
    * okuyabildiğimiz bir yapı. */
}
