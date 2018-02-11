package io.berkel.annotations.service;

import io.berkel.annotations.dao.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public void listEmployees() {
        System.out.println(employeeDAO.findAll());
    }

}
