package com.tms.solid.S.good;

public class DisplayObjectService {
    public void displayTextFromBook(Book book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Text: " + book.getText());
    }
}
