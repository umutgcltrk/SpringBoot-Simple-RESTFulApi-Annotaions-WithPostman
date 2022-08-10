package com.example.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController //Rest uygulaması olduğu için.
@RequestMapping(path = "/api") //"@RequestMappig" annotasyonu genelde class seviyesinde
public class HelloContoller {

    @GetMapping(path = "/sea") //"@GetMapping" annatasyonu ise metod seviyesinde ,
                                 // "@RequestMappig" annotasyonun daha spesifik , daha okunaklı hali.
                                 // @RequestMappig(path="/sea",method = RequestMethod.GET) uzun hali bu şekilde.
    public String sayHello(){
        return "Sea Spring";
    }

    @PostMapping("/save")
    public String save(){
        return "Data saved ";
    }

    @DeleteMapping("/delete")
    public String delete(){
        return "Data deleted";
    }
}
