package com.tms.solid.D.good;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService(new TelegramService());
        userService.registration();
    }
}
