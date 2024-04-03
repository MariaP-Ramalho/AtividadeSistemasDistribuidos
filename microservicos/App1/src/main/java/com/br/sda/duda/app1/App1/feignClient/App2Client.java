package com.br.sda.duda.app1.App1.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "app2", url = "http://localhost:8082")
public interface App2Client {

    @GetMapping("/number")
    Integer getNumber();




}
