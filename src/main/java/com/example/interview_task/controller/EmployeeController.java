package com.example.interview_task.controller;

import com.example.interview_task.dao.EmployeeRepo;
import com.example.interview_task.entity.Employee;
import com.example.interview_task.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeRepo employeeRepo;
    private EmployeeManager employeeManager;

    @Autowired
    public EmployeeController(EmployeeRepo employeeRepo, EmployeeManager employeeManager) {
        this.employeeRepo = employeeRepo;
        this.employeeManager = employeeManager;
    }

    @GetMapping("/all")
    public List<Employee> getAll(){return employeeManager.findAll();}


}
