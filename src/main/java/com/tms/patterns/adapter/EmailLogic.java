package com.tms.patterns.adapter;

public class EmailLogic {
    //прочитай сообщение
    //удали все сообщения
    //отправь в спам

    public void sendNewEmail(String message) {
        //тут логика отправки сообщения на email
        System.out.println("Sending new email:" + message);
    }
}
