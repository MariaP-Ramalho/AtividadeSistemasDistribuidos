package com.br.sda.duda.app1.App1.controller;


import com.br.sda.duda.app1.App1.feignClient.App2Client;
import com.netflix.discovery.EurekaClient;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.context.annotation.Lazy;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController

public class Controller {
    @Autowired
    @Lazy
    private EurekaClient eurekaClient;
    @Autowired
    private final App2Client app2Client;


    @GetMapping("/getNumber/")
    public ResponseEntity<Integer> returnNumber() {
// Tentativa1 de fazer o teste de conexão
//        List<ServiceInstance> instances = eurekaClient.getInstancesById("app2");
//        if (!instances.isEmpty()) {
            return ResponseEntity.ok(app2Client.getNumber());
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }


    }
}
