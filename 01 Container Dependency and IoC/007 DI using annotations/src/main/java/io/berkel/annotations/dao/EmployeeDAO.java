package io.berkel.annotations.dao;

import io.berkel.annotations.model.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

}
