package com.example.interview_task.service;

import com.example.interview_task.dao.EmployeeRepo;
import com.example.interview_task.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeManager {

    private EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeManager(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public Employee save(Employee employee) {
        return employeeRepo.save(employee);
    }


}
