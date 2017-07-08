package io.berkel.junitspring.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.berkel.junitspring.service.SampleService;
import io.berkel.junitspring.service.SampleServiceImpl;

@Configuration
public class AppConfig {

	@Bean
	public SampleService getSampleService() {
		return new SampleServiceImpl();
	}
	
}
