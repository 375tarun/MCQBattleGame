package com.mcqbattlegame.mcqbg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        int today = 123;
        return "Hello, Spring Boot is working!"+"today as well aa qwww";
    }
   @GetMapping("/hi")
    public String sayHi() {

        return "Hi, Spring Boot is working!";
    } @GetMapping("/welcome")
    public String welcome() {

        return "welcome, Spring Boot iswwwwwwwwww worwwwking!";
    }

}
