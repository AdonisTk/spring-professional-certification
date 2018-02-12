package io.berkel.beanpostprocessor.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="io.berkel.beanpostprocessor.*")
public class AppConfig {

}
