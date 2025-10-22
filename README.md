# 📚 SOAP Library Service (Spring Boot + HTTPS + Mutual TLS)

Este proyecto implementa un **servicio SOAP seguro** con **Spring Boot 3**, que permite gestionar una biblioteca de libros (añadir, listar, obtener y eliminar).  
La comunicación se realiza mediante **HTTPS** con **autenticación mutua (Mutual TLS / Two-Way SSL)**.

todavía testeando!!
---

## 🚀 Características

- Servicio **SOAP** implementado con `spring-boot-starter-web-services`.
- Comunicación **segura con certificados (keystore y truststore)**.
- Operaciones básicas:
  - `addBook(Book book)`
  - `getBook(int id)`
  - `listBooks()`
  - `deleteBook(int id)`
- Compatible con Postman y clientes Java SOAP generados vía WSDL.
- Ejemplo de configuración de certificados en cliente y servidor.

---

## 🧩 Tecnologías

- **Java 17**
- **Spring Boot 3.5.6**
- **Spring Web Services (Spring-WS)**
- **Apache WSS4J (seguridad WS-Security)**
- **Maven**
- **Tomcat embebido con HTTPS**
- **OpenSSL (para manipular certificados)**

---

## 📁 Estructura del Proyecto

soap-library/
├── src/
│ ├── main/
│ │ ├── java/com/example/soap_library/
│ │ │ ├── endpoint/LibraryEndpoint.java
│ │ │ ├── service/LibraryService.java
│ │ │ ├── service/impl/LibraryServiceImpl.java
│ │ │ ├── config/WebServiceConfig.java
│ │ │ └── SoapLibraryApplication.java
│ │ └── resources/
│ │ ├── certs/
│ │ │ ├── server-keystore.p12
│ │ │ ├── server-truststore.p12
│ │ │ ├── client-keystore.p12
│ │ │ └── client-truststore.p12
│ │ └── application.properties
├── pom.xml
└── README.md

## ⚙️ Configuración SSL (application.properties)

### properties
spring.application.name=soap-library
server.port=8443
server.ssl.enabled=true
server.ssl.key-store=classpath:certs/server-keystore.p12
server.ssl.key-store-password=serverpass
server.ssl.key-store-type=PKCS12
server.ssl.trust-store=classpath:certs/server-truststore.p12
server.ssl.trust-store-password=serverpass
server.ssl.trust-store-type=PKCS12
server.ssl.client-auth=need


CERTIFICADOS INCLUIDOS EN RESOURCES

## 🧪 EJECUCIÓN
mvn clean package
mvn spring-boot:run
verificar WSDL: https://localhost:8443/ws/library?wsdl

## ✍️ Autor
JOEL GUERRERO
Desarrollador Java | Spring | SOAP | REST | Seguridad TLS
