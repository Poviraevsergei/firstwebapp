package com.tms.solid.D.good;

public class TelegramService implements MessageService{
    @Override
    public void sendEmail(String to, String subject, String body) {
        System.out.println("Sending telegram message");
    }
}
