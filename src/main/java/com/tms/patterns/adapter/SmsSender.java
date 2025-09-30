package com.tms.patterns.adapter;

public class SmsSender implements ISender {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS SENDER: " + message);
    }
}
