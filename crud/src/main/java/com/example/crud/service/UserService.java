package com.example.crud.service;

import com.example.crud.dto.UserDto;
import com.example.crud.entity.Department;
import com.example.crud.entity.Employee;
import com.example.crud.entity.Role;
import com.example.crud.entity.User;

import java.util.List;

public interface UserService {
    List<Employee> getAllEmployees();
    List<Department> getAllDepartment();
    Employee saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    Employee updateEmployee(Employee employee);
    void deleteEmployeeById(Long id);


    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();






}