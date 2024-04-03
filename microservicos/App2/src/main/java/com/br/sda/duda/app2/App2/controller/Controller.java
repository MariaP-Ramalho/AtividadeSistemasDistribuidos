package com.br.sda.duda.app2.App2.controller;


import com.br.sda.duda.app2.App2.feignClient.App3Client;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@AllArgsConstructor
@RestController
public class Controller {


    @Autowired
    App3Client app3Client;


    @GetMapping("/number")
    public Integer getNumber() {
        Random random = new Random();
        return random.nextInt(100) + app3Client.getNumber();
    }


}
