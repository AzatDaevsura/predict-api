package com.azatdaevsura.predict_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class UserController {

    @PostMapping("/user")
    public String createUser() {

        return "User created successfully.";
    }

    @GetMapping("/users")
    public  String getAllUsers() {
        return "List of Users";
    }




}
