package io.berkel.genericqueries.main;

import io.berkel.genericqueries.config.AppConfig;
import io.berkel.genericqueries.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.performStatementCallback();
        context.close();

    }

}
