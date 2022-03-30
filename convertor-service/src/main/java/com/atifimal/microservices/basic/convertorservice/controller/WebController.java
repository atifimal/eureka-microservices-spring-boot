package com.atifimal.microservices.basic.convertorservice.controller;

import com.atifimal.microservices.basic.convertorservice.bean.RestConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Autowired
    private RestConsumer restConsumer;

    @GetMapping("/data")
    public String getPaymentData() {
        return "FROM PAYMENT-SERVICE : " + restConsumer.getInfo();
    }
}
