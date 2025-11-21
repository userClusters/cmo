package com.streaming.ort.cmo.controller;

import com.streaming.ort.cmo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Provider;

@RestController
@RequestMapping("Test")
public class TestController {
    @Autowired
    private TestService service;
    @GetMapping(value = "/main")
    private String hiMethod(){
        return "Hi, i an cfo";
    }
}
