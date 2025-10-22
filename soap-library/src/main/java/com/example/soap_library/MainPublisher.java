package com.example.soap_library;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainPublisher {
    public static void main(String[] args) {
        SpringApplication.run(MainPublisher.class, args);
        System.out.println("Servicio SOAP publicado en: https://localhost:8443/ws/library?wsdl");
    }
}

