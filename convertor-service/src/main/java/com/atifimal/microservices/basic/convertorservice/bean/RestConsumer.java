package com.atifimal.microservices.basic.convertorservice.bean;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class RestConsumer {

    @Autowired
    private DiscoveryClient client;

    public String getInfo() {
        List<ServiceInstance> siList = client.getInstances("currency-service");
        ServiceInstance si = siList.get(0);

        String url = si.getUri() +"/exchange/usd/try";

        //If you need to use IP instead of hostname, you can use the line (with getting IP and port from somewhere)
        //String url = "http://192.168.1.19:8000" +"/exchange/usd/try";


        RestTemplate rt = new RestTemplate();

        String response = rt.getForObject(url, String.class);

        return response;
    }
}
