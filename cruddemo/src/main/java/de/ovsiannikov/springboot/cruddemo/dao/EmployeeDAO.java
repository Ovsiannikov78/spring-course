package de.ovsiannikov.springboot.cruddemo.dao;

import de.ovsiannikov.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    public List<Employee> findAll();
}
