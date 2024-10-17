package ru.mediasoft.demostarterexceptionhandler.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "custom.error")
@Getter
@Setter
public class ErrorProperties {
    private String defaultErrorMessage = "An error occurred";
}
