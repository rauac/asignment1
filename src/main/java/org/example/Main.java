package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Phone iphone = context.getBean(Phone.class);
        System.out.println(iphone.getBrand());
    }
}