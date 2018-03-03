package io.berkel.pointcut.annotation.config;

import io.berkel.pointcut.annotation.aspect.UserAspect;
import io.berkel.pointcut.annotation.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public UserService userService(){
        return new UserService();
    }

    @Bean
    public UserAspect userAspect(){
        return new UserAspect();
    }

}
