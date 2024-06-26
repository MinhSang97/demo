package com.example.demo.util;

public class UUID {
public static String GenerateUUID() {
    String uuid = java.util.UUID.randomUUID().toString();
        return uuid;
    }
}
