package com.tms.solid.S.bad;

//1. Model
//2. Display
//3. Repository
public class Book {
    private String title;
    private String author;
    private String text;

    public Book(String title, String author, String text) {
        this.title = title;
        this.author = author;
        this.text = text;
    }

    public void displayText() {
        System.out.println("Title: " + title);
        System.out.println("Text: " + text);
    }

    public void printAndSaveBookIntoFolder(String path, Book book) {
        // print
        // save
    }
}
