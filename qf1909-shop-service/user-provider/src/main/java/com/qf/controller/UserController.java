package com.qf.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("hi")
    @ResponseBody
    public String hello(String message) {

        return null;
    }


    }
