package com.jgmedellin.crud_employee_demo_api.service;

//import com.jgmedellin.crud_employee_demo_api.dao.EmployeeDAO;
import com.jgmedellin.crud_employee_demo_api.dao.EmployeeRepository;
import com.jgmedellin.crud_employee_demo_api.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    // With DAOs
    //private final EmployeeDAO employeeDAO;

    /*@Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }*/

    // With Spring Data JPA
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        //return employeeDAO.findAll();
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theId) {
        //return employeeDAO.findById(theId);
        return employeeRepository.findById(theId).orElseThrow(() ->
                new RuntimeException("Employee id not found - " + theId));
    }

    //@Transactional // This annotation is not needed when using Spring Data JPA
    @Override
    public Employee save(Employee theEmployee) {
        //return employeeDAO.save(theEmployee);
        return employeeRepository.save(theEmployee);
    }

    //@Transactional // This annotation is not needed when using Spring Data JPA
    @Override
    public void deleteById(int theId) {
        //employeeDAO.deleteById(theId);
        employeeRepository.deleteById(theId);
    }

}