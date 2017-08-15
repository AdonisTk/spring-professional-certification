package io.berkel.autowired.bean.setter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Company getCompany() {
        Company company = new Company();
        company.setCompName("ABCD SA");
        company.setLocation("Buenos Aires");
        return company;
    }

    @Bean
    public Employee getEmployee() {
        return new Employee();
    }

}
