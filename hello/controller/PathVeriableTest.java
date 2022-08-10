package com.example.hello.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api2")
public class PathVeriableTest {
    /* @PathVariable annatasyonu kullanıcıdan veri aldığımız annatasyonlardan biridir. */

    //"@PathVariable" annatasyonu ile kullanıcı tarafından ,
    // "getMyMessage" metodunun parametresine gelen mesajı get isteği ile gösterme.

    @GetMapping(path = "/message/{message}")
    public String getMyMessage(@PathVariable String message){
        return "Your message is :"+message;
    }

    //GetMapping içindeki path de "/message/{message}" kısmındaki "{message}" kısmı,
    // parametreden gelen message ile eşleşiyor tabi bu "@PathVariable" annatasyonu sayesinde.

    //    @GetMapping(path = "/message/{m}")
    //    public String getMyMessage(@PathVariable('m') String message){
    //        return "Your message is :"+message;
    //    }

    //Uzun hali bu şekilde.
}
