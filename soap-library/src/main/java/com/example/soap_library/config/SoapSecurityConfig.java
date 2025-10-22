package com.example.soap_library.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;
import org.springframework.ws.soap.security.wss4j2.support.CryptoFactoryBean;

import java.io.IOException;
import java.util.Objects;

@Configuration
public class SoapSecurityConfig {
    @Bean
    public Wss4jSecurityInterceptor securityInterceptor() throws Exception {
        Wss4jSecurityInterceptor interceptor = new Wss4jSecurityInterceptor();
        interceptor.setSecurementActions("Signature");
        interceptor.setSecurementUsername("client");
        interceptor.setSecurementPassword("clientpass");
        interceptor.setSecurementSignatureCrypto(Objects.requireNonNull (cryptoFactoryBean ().getObject ()));
        return interceptor;
    }

    @Bean
    public CryptoFactoryBean cryptoFactoryBean() throws IOException {
        CryptoFactoryBean crypto = new CryptoFactoryBean();
        crypto.setKeyStoreLocation(new ClassPathResource("certs/client-keystore.p12"));
        crypto.setKeyStorePassword("clientpass");
        return crypto;
    }
}
