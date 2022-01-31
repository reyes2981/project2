package com.spring.springtech.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RoleController {

    @GetMapping("/hello-world/")
    public String getHelloWorld() {
        return "Hello World!";
    }

    @GetMapping("/roles/")
    public String getAllRoles() {
        return "all roles";
    }

    @PostMapping("/roles/")
    public String createRole(@RequestBody String body) {
        return "creating a role " + body;
    }

    @GetMapping("/roles/{roleId}/")
    public String getRole(@PathVariable Long roleId) {
        return "getting the category with id of " + roleId;
    }

    @PutMapping("/roles/{roleId}/")
    public String updateRole(@PathVariable(value = "roleId") Long roleId, @RequestBody String body) {
        return "updating the category with id of " + roleId + body;
    }

    @DeleteMapping ("/roles/{roleId}/")
    public String deleteRole(@PathVariable(value = "roleId") Long roleId) {
        return "deleting the role with id of " + roleId;
    }

}
