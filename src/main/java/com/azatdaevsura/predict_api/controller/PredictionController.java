package com.azatdaevsura.predict_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.azatdaevsura.predict_api.logic.PredictionService_Interface;

@RestController
@RequestMapping("/api")
public class PredictionController {

    @GetMapping("/predict")
    public String predict() {

        return "This is a prediction result.";
    }

    @PostMapping("/user/{id}/predict")
    public String predictForUser() {
        return "Prediction result for user with ID: {id}";
    }




}
