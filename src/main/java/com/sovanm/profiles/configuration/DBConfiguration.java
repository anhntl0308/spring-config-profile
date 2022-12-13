package com.sovanm.profiles.configuration;

import com.sovanm.profiles.model.DataSource;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Log4j2
@RequiredArgsConstructor
public class DBConfiguration {

	private final DataSource dataSource;

	@Value("${message-from-application-properties}")
	String message;

	@Value("${spring.profiles.active}")
	String profileName;

	@Profile("dev")
	@Bean
	public String devDatabaseConnection() {
		log.info(profileName);
		log.info(message);
		log.info(dataSource.getDriverClassName());
		log.info(dataSource.getUrl());
		return "success";
	}
	@Profile("test")
	@Bean
	public String testDatabaseConnection() {
		log.info(profileName);
		log.info(dataSource.getDriverClassName());
		log.info(dataSource.getUrl());
		return "success";
	}
	@Profile("prod")
	@Bean
	public String prodDatabaseConnection() {
		log.info(profileName);
		log.info(dataSource.getDriverClassName());
		log.info(dataSource.getUrl());
		return "success";
	}
}
