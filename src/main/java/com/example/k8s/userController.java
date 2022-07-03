package com.example.k8s;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class userController {

    @GetMapping("/")
    public String getUsers(){

        return "updated message";
    }


}
