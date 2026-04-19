package com.azatdaevsura.predict_api.controller;

import com.azatdaevsura.predict_api.logic.UserService;
import com.azatdaevsura.predict_api.model.UserModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class UserController {
    UserService userService = new UserService();

    @PostMapping("/user")
    public String createUser(@RequestBody UserModel user) {
        //userService.createUser(user.getUserName(), user.getStudyHours(), user.getSleepHours(), user.getPhysicalActivityHours(), user.getDietQuality(), user.getStressLevel());

        return "User created successfully.";
    }

    @GetMapping("/users")
    public  String getAllUsers() {
        userService.getAllUsers();
        return "List of Users";
    }
    @GetMapping("/user/{id}")
    public String getUserById() {
        userService.getUserById(UserModel.userIdCounter);
        return "User details for ID: {id}";
    }
    @GetMapping("user/{id}/prediction")
    public String getPredictionForUser() {
        return "Prediction result for user with ID: {id}";
    }
    @DeleteMapping("/user/{id}")
    public String deleteUser() {
        userService.deleteUser(UserModel.userIdCounter);
        return "User with ID: {id} deleted successfully.";
    }




}
