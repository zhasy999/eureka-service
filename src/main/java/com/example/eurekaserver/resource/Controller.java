package com.example.eurekaserver.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class Controller {
    @GetMapping
    public String helllo(){
        return "Hello world";
    }
}
