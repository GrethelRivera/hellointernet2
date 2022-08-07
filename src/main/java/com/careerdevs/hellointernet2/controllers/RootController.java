package com.careerdevs.hellointernet2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    private String routeRoute() {
        return "You requested the root route";
    }

    @GetMapping("/hello")
    private String helloRoute() {
        return "Hello CareerDevs!!!!";
    }
}

