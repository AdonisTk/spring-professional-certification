package io.berkel.transactional.main;

import io.berkel.transactional.config.AppConfig;
import io.berkel.transactional.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.performSQLQueries();
        context.close();

    }

}
