package io.berkel.autowired.component.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

    @Autowired
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
