package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Phone {
    private String name;
    private String brand;
    private int price;
    private OS OS;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Autowired
    public void setOS(OS OS) {
        this.OS = OS;
    }

    public OS getOS() {
        return OS;
    }
}
