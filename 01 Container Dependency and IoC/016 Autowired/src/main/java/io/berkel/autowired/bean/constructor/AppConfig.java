package io.berkel.autowired.bean.constructor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Company getCompany() {
        Company company = new Company();
        company.setCompName("ABCD SRL");
        company.setLocation("Milano");
        return company;
    }

    @Bean
    public Employee getEmployee() {
        return new Employee(getCompany());
    }

}
