package io.berkel.autowired.bean.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Employee {

    private Company company;

    @Value("Fabio Gaiera")
    private String name;

    public Company getCompany() {
        return company;
    }

    //Autowired with setter
    @Autowired
    public void setCompany(Company company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
