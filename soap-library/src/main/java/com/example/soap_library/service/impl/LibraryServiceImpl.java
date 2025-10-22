package com.example.soap_library.service.impl;

import com.example.soap_library.model.Book;
import com.example.soap_library.service.LibraryService;
import jakarta.jws.WebService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@WebService(endpointInterface = "com.example.soap_library.service.LibraryService")
public class LibraryServiceImpl implements LibraryService {

    private final List<Book> books = new ArrayList<>();

    @Override
    public String addBook(Book book) {
        books.add(book);
        return "Libro agregado: " + book.getTitle();
    }

    @Override
    public Book getBook(int id) {
        return books.stream().filter(b -> b.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Book> listBooks() {
        return books;
    }

    @Override
    public String deleteBook(int id) {
        return books.removeIf(b -> b.getId() == id) ? "Libro eliminado" : "No se encontró el libro";
    }
}

