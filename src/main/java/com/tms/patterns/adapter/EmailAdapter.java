package com.tms.patterns.adapter;

public class EmailAdapter extends EmailLogic implements ISender {

    @Override
    public void sendMessage(String message) {
        sendNewEmail(message);
    }
}

/*
 private final EmailLogic emailLogic = new EmailLogic();

    @Override
    public void sendMessage(String message) {
        emailLogic.sendNewEmail(message);
    }
 */
