package com.example.interview_task.controller;

import com.example.interview_task.dao.EmployeeRepo;
import com.example.interview_task.service.EmployeeManager;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {

    private EmployeeRepo employeeRepo;
    private EmployeeManager employeeManager;

    public EmployeeController(EmployeeRepo employeeRepo, EmployeeManager employeeManager) {
        this.employeeRepo = employeeRepo;
        this.employeeManager = employeeManager;
    }
}
