package io.berkel.autowired.component.setter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main( String[] args ) {

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        EmployeeService employeeService = context.getBean(EmployeeService.class);
        System.out.println(employeeService.getEmployee().getEmpMsg());
        context.close();

    }

}
