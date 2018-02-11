package io.berkel.annotations.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"io.berkel.annotations.*"})
public class AppConfig {

}
