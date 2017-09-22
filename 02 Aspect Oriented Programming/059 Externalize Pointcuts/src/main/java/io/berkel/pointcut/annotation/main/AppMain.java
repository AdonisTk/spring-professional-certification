package io.berkel.pointcut.annotation.main;

import io.berkel.pointcut.annotation.config.AppConfig;
import io.berkel.pointcut.annotation.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.someUserService();
        context.close();

    }

}
