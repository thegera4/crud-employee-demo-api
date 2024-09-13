package com.jgmedellin.crud_employee_demo_api.dao;

import com.jgmedellin.crud_employee_demo_api.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
