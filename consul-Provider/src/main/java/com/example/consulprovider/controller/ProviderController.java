package com.example.consulprovider.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderController {
    @GetMapping("/get")
    public Object get() {
        System.out.println("消费者内部 ---- 调用完成");
        return "你已经消费了";
    }
}
