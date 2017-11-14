package io.berkel.callback.main;

import io.berkel.callback.config.AppConfig;
import io.berkel.callback.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.performRowCallbackHandler();
        userService.performPreparedStatementCreator();
        context.close();

    }

}
