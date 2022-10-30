package com.example.employeeproj.service;

import com.example.employeeproj.entity.Employee;
import com.example.employeeproj.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);


    }

}
