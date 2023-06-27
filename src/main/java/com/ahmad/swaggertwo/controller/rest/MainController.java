package com.ahmad.swaggertwo.controller.rest;

import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @PostMapping("/custom/{firstname}")
    public String custom(@PathVariable String firstname) {
        return "custom";
    }

}
