package com.example.soap_library.endpoint;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "addBookResponse")
public class AddBookResponse {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
