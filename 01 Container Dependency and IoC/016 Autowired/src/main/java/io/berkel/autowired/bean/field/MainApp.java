package io.berkel.autowired.bean.field;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main( String[] args ) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = context.getBean(Employee.class);
        System.out.println("Company Name: " + employee.getCompany().getCompName());
        System.out.println("Location: " + employee.getCompany().getLocation());
        System.out.println("Name: " + employee.getName());
        context.close();

    }


}
