package io.berkel.autowired.bean.setter;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

    private Company company;

    public Company getCompany() {
        return company;
    }

    //Autowired with setter
    @Autowired
    public void setCompany(Company company) {
        this.company = company;
    }

}
