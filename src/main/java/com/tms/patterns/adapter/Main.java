package com.tms.patterns.adapter;

public class Main {
    public static void main(String[] args) {
        ISender sender = new EmailAdapter();

        sender.sendMessage("Hello World!!!");
    }
}
