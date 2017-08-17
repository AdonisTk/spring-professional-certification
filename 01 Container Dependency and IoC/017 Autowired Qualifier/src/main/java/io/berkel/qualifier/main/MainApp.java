package io.berkel.qualifier.main;

import io.berkel.qualifier.config.AppConfig;
import io.berkel.qualifier.service.AnimalService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AnimalService animalService = context.getBean(AnimalService.class);
        animalService.getAnimal().printName();
        animalService.getZoo().getZooName();
        context.close();

    }

}
