package com.cpifppiramide.yolbell.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MirestController {

    @GetMapping("/")
    public String main(){
        return "hola amigos";
    }
}
