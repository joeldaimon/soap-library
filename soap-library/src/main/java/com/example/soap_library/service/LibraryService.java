package com.example.soap_library.service;

import com.example.soap_library.model.Book;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.util.List;

@WebService
public interface LibraryService {

    @WebMethod
    String addBook(@WebParam(name = "book") Book book);

    @WebMethod
    Book getBook(@WebParam(name = "id") int id);

    @WebMethod
    List<Book> listBooks();

    @WebMethod
    String deleteBook(@WebParam(name = "id") int id);
}
