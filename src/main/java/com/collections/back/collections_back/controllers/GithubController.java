package com.collections.back.collections_back.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/github")
public class GithubController {

    @PostMapping("/{code}")
    public String postMethodName(@RequestBody String code) {
        //TODO: process POST request
        
        return code;
    }
            

}
