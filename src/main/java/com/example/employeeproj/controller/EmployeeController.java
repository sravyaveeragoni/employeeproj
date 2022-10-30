package com.example.employeeproj.controller;

import com.example.employeeproj.entity.Employee;
import com.example.employeeproj.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }



}
