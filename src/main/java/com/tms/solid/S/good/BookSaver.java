package com.tms.solid.S.good;

import com.tms.solid.S.bad.Book;

public class BookSaver {
    public void saveBookIntoFolder(String path, Book book) {
        // логика сохранения книги на сервер
    }

    public void saveBookIntoMySQlDatabase(Book book) {
        // логика сохранения книги в бд
    }
}
