package com.azatdaevsura.predict_api.controller;


import org.springframework.boot.webmvc.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class c_ErrorController implements ErrorController {

    @RequestMapping("/error")
    public  String standardError() {
        return "An error occurred while processing your request.";
    }

}
