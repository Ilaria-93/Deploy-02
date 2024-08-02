package com.example.deploy2.services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomSumService {

    public Integer sum() {
        Random random = new Random();
        Integer num1 = random.nextInt(58);
        Integer num2 = random.nextInt(123);
        return num1 + num2;
    }
}
