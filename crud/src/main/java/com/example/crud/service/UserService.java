package com.example.crud.service;




import com.example.crud.entity.Department;
import com.example.crud.entity.Employee;
import com.example.crud.entity.Login;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<Employee> getAllEmployees();
    List<Department> getAllDepartment();
    Employee saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    Employee updateEmployee(Employee employee);
    void deleteEmployeeById(Long id);

    List<Login> getAllCredentials();




}