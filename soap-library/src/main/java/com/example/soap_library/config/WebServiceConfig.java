package com.example.soap_library.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurer;
import org.springframework.ws.server.EndpointInterceptor;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;

import java.util.List;

@EnableWs
@Configuration
public class WebServiceConfig implements WsConfigurer {

    private final Wss4jSecurityInterceptor securityInterceptor;

    public WebServiceConfig(Wss4jSecurityInterceptor securityInterceptor) {
        this.securityInterceptor = securityInterceptor;
    }

    @Override
    public void addInterceptors(List<EndpointInterceptor> interceptors) {
        interceptors.add(securityInterceptor);
    }
}
