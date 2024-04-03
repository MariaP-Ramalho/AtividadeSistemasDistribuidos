package com.br.sda.duda.app2.App2.feignClient;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "app3", url = "http://localhost:8083")
public interface App3Client {

    @GetMapping("/number")
    Integer getNumber();
}

