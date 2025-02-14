package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class Config {
    @Bean
    Phone iphone(){
        Phone iphone = new Phone();
        iphone.setName("IPhone 16");
        iphone.setBrand("Apple");
        iphone.setPrice(500000);
        return iphone;
    }
}
