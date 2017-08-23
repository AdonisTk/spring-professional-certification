package io.berkel.aop.config;

import io.berkel.aop.aspect.UserAspect;
import io.berkel.aop.service.UserService;
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
