package com.wynn.k8sstudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @RequestMapping("welcome")
    public String welcome(){
        return "K8s so easy!!!!!";
    }
}
