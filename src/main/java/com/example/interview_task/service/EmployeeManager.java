package com.example.interview_task.service;

import com.example.interview_task.dao.EmployeeRepo;
import com.example.interview_task.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeManager {

    private EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeManager(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<Employee> findAll() {
        return employeeRepo.findAll();
    }

    public Optional<Employee> findById(Long givenId) {
        return employeeRepo.findById(givenId);
    }

    public List<Employee> findByName(String givenName) {
        return employeeRepo.findByName(givenName);
    }

    public Employee save(Employee employee) {
        return employeeRepo.save(employee);
    }

    public void deleteById(Long givenId) {
        employeeRepo.deleteById(givenId);
    }
}
