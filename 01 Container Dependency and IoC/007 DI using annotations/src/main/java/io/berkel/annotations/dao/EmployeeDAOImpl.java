package io.berkel.annotations.dao;

import io.berkel.annotations.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public List<Employee> findAll() {

        Employee employee1 = new Employee();
        employee1.setName("Pietro");
        employee1.setSurname("Santana");
        employee1.setId(1);

        Employee employee2 = new Employee();
        employee2.setName("Mario");
        employee2.setSurname("Rossi");
        employee2.setId(2);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);

        return employeeList;

    }

}
