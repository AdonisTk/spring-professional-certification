package io.berkel.autowired.bean.field;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

    @Autowired
    private Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

}
