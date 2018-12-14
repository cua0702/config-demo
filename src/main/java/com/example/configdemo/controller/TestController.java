package com.example.configdemo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope //开启更新功能
@RestController
public class TestController {

    @Value("${name}")
    private String name;
    @Value("${age}")
    private String age;
    @Value("${version}")
    private String version;

    @GetMapping("/test")
    public String test(){
        return name +"-" + age + "-" + version;
    }
}
