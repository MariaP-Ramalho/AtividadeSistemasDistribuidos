package com.br.sda.duda.app1.App1.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class App1Configuration {

    @Configuration
    public static class AddressConfig {
        @Bean
        public ModelMapper modelMapper() {
            return new ModelMapper();
        }
    }

}
