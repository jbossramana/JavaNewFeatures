package com.module.simple;

import com.example.MyService;

public class Simple implements MyService {
    @Override
    public void performAction() {
        System.out.println("Performing a simple action.");
    }

    public String getInfo() {
        return "Be Happy";
    }
}