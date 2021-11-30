package com.corner.Writer.controllers;

import com.corner.Writer.models.Author;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WriterController {
    private WriterServices obj;
    @PostMapping("/signup")
    public void signUpRoute(@RequestBody Author author){
        obj.signUpUser(author);
    }
}
