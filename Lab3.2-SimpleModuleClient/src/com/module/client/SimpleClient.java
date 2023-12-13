package com.module.client;

import java.util.ServiceLoader;

import com.example.MyService;
import com.module.simple.Simple;

public class SimpleClient {
    public static void main(String[] args) {
        Simple simple = new Simple();
        System.out.println(simple.getInfo());

        // Use the service provided by com.module.simple
        MyService myService = ServiceLoader.load(MyService.class).findFirst().orElse(null);
        if (myService != null) {
            myService.performAction();
        } else {
            System.out.println("MyService not found.");
        }
    }
}