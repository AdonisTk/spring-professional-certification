package io.berkel.beanpostprocessor.main;

import io.berkel.beanpostprocessor.config.AppConfig;
import io.berkel.beanpostprocessor.service.MessageService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageService messageService = ctx.getBean(MessageService.class);
        messageService.print();
        ctx.close();

    }

} 