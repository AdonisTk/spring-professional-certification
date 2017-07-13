package io.berkel.beanid.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.berkel.beanid.service.HelloWorld;

@Configuration
public class AppConfig {
	
		@Bean
		public HelloWorld getHelloWorld() {
			return new HelloWorld();
		}

}
