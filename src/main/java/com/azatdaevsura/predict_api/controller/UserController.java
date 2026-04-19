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
    @GetMapping("/user/{id}")
    public String getUserById() {
        return "User details for ID: {id}";
    }
    @GetMapping("user/{id}/prediction")
    public String getPredictionForUser() {
        return "Prediction result for user with ID: {id}";
    }




}
