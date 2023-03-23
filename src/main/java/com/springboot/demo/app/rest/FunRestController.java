package com.springboot.demo.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String getWorkout(){
        return "Run a hard 5K!";
    }
    @GetMapping("/fortune")
    public String getFortune(){
        return "Today is your lucky day.";
    }

}
