package com.jgmedellin.crud_employee_demo_api.dao;

import com.jgmedellin.crud_employee_demo_api.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// Spring Data JPA provides a powerful way to work with data. It is a part of the
// Spring Data project and makes it easy to use JPA in Spring applications.
// This interface extends JpaRepository which provides CRUD methods
// out of the box (no need to write any code).
// Spring Data JPA will provide the implementation at runtime.
// The JpaRepository interface takes two parameters: the entity type and
// the primary key type. In this example, the entity type is Employee and
// the primary key type is Integer in our database.
public interface EmployeeRepository extends JpaRepository<Employee, Integer> { }