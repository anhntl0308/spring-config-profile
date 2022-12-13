package com.sovanm.profiles.configuration;

import com.sovanm.profiles.model.DataSource;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@RequiredArgsConstructor
@Slf4j
@Profile("local")
public class LocalDataConfiguration {

    private final DataSource dataSource;
    @Value("${message-from-application-properties}")
    String message;

    @Value("${spring.profiles.active}")
    String profileName;
    @Bean
    public String localDatabaseConnection() {
        log.info(message);
        log.info(profileName);
        log.info(dataSource.getDriverClassName());
        log.info(dataSource.getUrl());
        return "success";
    }

    @Bean
    public String awsDatabaseConnection() {
        log.info(message);
        log.info(dataSource.getDriverClassName());
        log.info(dataSource.getUrl());
        return "success";
    }
}

