package com.example.deploy2.controllers;

import com.example.deploy2.services.RandomSumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RandomSumController {

    @Autowired
    private RandomSumService randomSumService;

    @GetMapping("/sum")
    public Integer getRandomSum() {
        return randomSumService.sum();
    }
}
