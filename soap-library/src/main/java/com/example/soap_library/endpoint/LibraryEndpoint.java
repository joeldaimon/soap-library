package com.example.soap_library.endpoint;

import com.example.soap_library.service.impl.LibraryServiceImpl;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class LibraryEndpoint {

    private static final String NAMESPACE_URI = "http://service.soap_library.example.com/";

    private final LibraryServiceImpl libraryService;

    public LibraryEndpoint(LibraryServiceImpl libraryService) {
        this.libraryService = libraryService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "addBookRequest")
    @ResponsePayload
    public AddBookResponse addBook(@RequestPayload AddBookRequest request) {
        libraryService.addBook(request.getBook());
        AddBookResponse response = new AddBookResponse();
        response.setStatus("OK");
        return response;
    }
}
