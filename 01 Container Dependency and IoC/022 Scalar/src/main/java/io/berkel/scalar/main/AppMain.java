package io.berkel.scalar.main;

import io.berkel.scalar.config.AppConfig;
import io.berkel.scalar.service.BookService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        BookService bookService = context.getBean(BookService.class);
        bookService.printBook();
        context.close();

    }

}
