package io.berkel.springdata.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.berkel.springdata.config.AppConfig;

public class AppMain {

    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        context.close();

    }

}
