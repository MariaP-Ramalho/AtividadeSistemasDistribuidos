package com.br.sda.duda.app3.App3.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@AllArgsConstructor
@RestController
public class Controller {


    @GetMapping("/number")
    public Integer getNumber() {
        Random random = new Random();

        return random.nextInt(100);
    }


}
