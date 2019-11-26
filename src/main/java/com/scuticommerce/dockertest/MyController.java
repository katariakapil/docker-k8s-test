package com.scuticommerce.dockertest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class MyController {

    @GetMapping
    public String hello (){

        return "hello world";
    }
}
