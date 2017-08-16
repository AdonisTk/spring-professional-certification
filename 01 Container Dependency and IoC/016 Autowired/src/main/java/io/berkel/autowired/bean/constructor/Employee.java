package io.berkel.autowired.bean.constructor;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

    private Company company;

    @Autowired
    public Employee(Company company) {
        this.company = company;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}
