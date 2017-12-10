package io.berkel.springdata.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.berkel.springdata.config.AppConfig;
import io.berkel.springdata.service.CityService;

public class AppMain {

    public static void main(String[] args) throws Exception {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CityService cityService = context.getBean(CityService.class);
        System.out.println(cityService.findAll1());
        System.out.println(cityService.findAll2());
        context.close();

    }

}
