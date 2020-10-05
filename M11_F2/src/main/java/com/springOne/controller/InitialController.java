package com.springOne.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class InitialController {

    @GetMapping("")
    public String helloWorld() {
        return "HELLO WORLD";
    }

    @GetMapping("/{name}")
   public String helloUser(
           @PathVariable("name") String name){
    	return  "Hello, " + name;        
    }
}
