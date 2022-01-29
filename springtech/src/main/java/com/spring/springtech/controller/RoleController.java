package com.spring.springtech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class RoleController {

    @GetMapping(path = "api/hello-world/")
    public String getHelloWorld() {
        return "Hello World!";
    }

}
