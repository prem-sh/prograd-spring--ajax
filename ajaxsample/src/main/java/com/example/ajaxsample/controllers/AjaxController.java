package com.example.ajaxsample.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class AjaxController {
    @GetMapping(path = "/call")
    public ResponseEntity<String> call(){
        return new ResponseEntity<>("Api's Result from backend", HttpStatus.OK);
    }
}
