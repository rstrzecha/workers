package com.example.interview_task.controller;

import com.example.interview_task.dao.EmployeeRepo;
import com.example.interview_task.entity.ActiveEmployee;
import com.example.interview_task.entity.Employee;
import com.example.interview_task.service.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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

    @PutMapping("/{id}/newEmployersName/{name}")
    public ResponseEntity<ActiveEmployee> modEmployersName(@PathVariable("id") Long id,
                                                          @PathVariable("name") String newEmployersName) {

        Optional<Employee> foundEmployee = employeeManager.findById(id);
        if(foundEmployee.isPresent()) {
            Employee newEmployee = foundEmployee.get();
            newEmployee.setName(newEmployersName);
            newEmployee.setId(id);
            employeeManager.save(newEmployee);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
