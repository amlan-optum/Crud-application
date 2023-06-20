package com.example.crud.service.Impl;

import com.example.crud.entity.Department;
import com.example.crud.entity.Employee;
import com.example.crud.entity.Login;
import com.example.crud.repository.DepartmentRepository;
import com.example.crud.repository.EmployeeRepository;
//import com.example.crud.repository.LoginRepository;
import com.example.crud.repository.LoginRepository;
import com.example.crud.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceImpl implements UserService {
    private EmployeeRepository employeeRepository;
    private DepartmentRepository departmentRepository;
    private LoginRepository loginRepository;
    public ServiceImpl(EmployeeRepository employeeRepository,DepartmentRepository departmentRepository,LoginRepository loginRepository) {
        super();
        this.employeeRepository = employeeRepository;
        this.departmentRepository=departmentRepository;
        this.loginRepository=loginRepository;
    }

    @Override
    public List<Employee> getAllEmployees(){

        return employeeRepository.findAll();
    }
    @Override
    public List<Department> getAllDepartment(){
        return departmentRepository.findAll();
    }
    @Override
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    @Override
    public Employee getEmployeeById(Long id){
        return employeeRepository.findById(id).get();
    }
    @Override
    public Employee updateEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
    @Override
    public void deleteEmployeeById(Long id){
        employeeRepository.deleteById(id);
    }


    @Override
    public List<Login> getAllCredentials(){
        return loginRepository.findAll();
    }




}