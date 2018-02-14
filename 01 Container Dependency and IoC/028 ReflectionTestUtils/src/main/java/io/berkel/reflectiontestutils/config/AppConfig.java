package io.berkel.reflectiontestutils.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.berkel.reflectiontestutils.service.PersonService;
import io.berkel.reflectiontestutils.service.PersonServiceImpl;

@Configuration
public class AppConfig {
	
	@Bean
	public PersonService getPerson() {
		return new PersonServiceImpl();
	}
	
}
