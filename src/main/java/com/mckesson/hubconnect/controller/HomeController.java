package com.mckesson.hubconnect.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/healthcheck")
    public String greeting() {
        return "From Hub Connect Controller - Health Check OK...!!!!";
    }


}
