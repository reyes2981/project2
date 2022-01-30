package com.spring.springtech.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class RoleController {

    @GetMapping(path = "/hello-world/")
    public String getHelloWorld() {
        return "Hello World!";
    }

    @GetMapping(path = "/roles/")
    public String getAllRoles() {
        return "all roles";
    }

    @PostMapping("/roles/")
    public String createRole(@RequestBody String body) {
        return "creating a role " + body;
    }

}
