package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.Random;

@Repository
public class CoucouDaoMock  {
    public String getRandomCoucou(){
        return "MOCK";
    }
}
