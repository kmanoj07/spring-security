package com.kumarmnaoj.ss_2023_c1_e1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(path  = "/hello")
    public String hello() {
        return "Hello !";
    }
}
