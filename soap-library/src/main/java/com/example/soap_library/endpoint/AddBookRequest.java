package com.example.soap_library.endpoint;

import com.example.soap_library.model.Book;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "addBook")
public class AddBookRequest {
    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
