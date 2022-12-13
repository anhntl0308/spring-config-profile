package com.sovanm.profiles.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Component
@ConfigurationProperties("spring.datasource")
public class DataSource {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
}
