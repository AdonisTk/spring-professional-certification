package io.berkel.joinpoint.annotation.main;

import io.berkel.joinpoint.annotation.config.AppConfig;
import io.berkel.joinpoint.annotation.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.someUserService(1,2);
        userService.anotherUserService(1,2,3);
        context.close();

    }

}
