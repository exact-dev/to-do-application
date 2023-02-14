package com.codestates.todoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/to-do")
public class TodoController {

    @GetMapping
    public String todoWorld(){
        return "To-do Application !";
    }
}
