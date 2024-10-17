package ru.mediasoft.demostarterexceptionhandler.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ErrorProperties.class)
public class ExceptionHandlerAutoConfiguration {

    @Bean
    public GlobalExceptionHandler globalExceptionHandler(ErrorProperties errorProperties) {
        return new GlobalExceptionHandler(errorProperties);
    }
}