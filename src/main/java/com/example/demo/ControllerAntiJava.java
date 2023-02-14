package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAntiJava {
    @Autowired
    CoucouDao coucouDao;

    @GetMapping(path = "coucou")
    public ResponseEntity<String> getCoucou(){
        return new ResponseEntity<>(coucouDao.getRandomCoucou(), HttpStatus.OK);
    }
}
