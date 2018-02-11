package io.berkel.annotations.main;

import io.berkel.annotations.config.AppConfig;
import io.berkel.annotations.service.EmployeeService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService employeeService = context.getBean(EmployeeService.class);
        employeeService.listEmployees();
        context.close();

    }

}
