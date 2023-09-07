package com.example.CrudApp.service;

import com.example.CrudApp.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeServiceInterface {
    public Employee createEmployee(Employee employee);
    public  Employee getEmployeeById(int id);
     List <Employee> getAllEmployees();
     Employee updateEmployee(int id, Employee employee);
     void deleteEmployee(int id);
}
