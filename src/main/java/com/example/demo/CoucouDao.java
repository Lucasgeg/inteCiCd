package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.Random;

@Repository
public class CoucouDao  {
    String []DATA={"coucou", "Salut", "Yolo"};

    public String getRandomCoucou(){
        int i = new Random().nextInt(DATA.length);
        return DATA[i];
    }
}
