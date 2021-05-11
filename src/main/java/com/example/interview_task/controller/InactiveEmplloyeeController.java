package com.example.interview_task.controller;

import com.example.interview_task.dao.InactiveEmployeeRepo;
import com.example.interview_task.entity.InactiveEmployee;
import com.example.interview_task.service.InactiveEmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InactiveEmplloyeeController {

    private InactiveEmployeeRepo inactiveEmployeeRepo;
    private InactiveEmployeeManager inactiveEmployeeManager;

    @Autowired
    public InactiveEmplloyeeController(InactiveEmployeeRepo inactiveEmployeeRepo, InactiveEmployeeManager inactiveEmployeeManager) {
        this.inactiveEmployeeRepo = inactiveEmployeeRepo;
        this.inactiveEmployeeManager = inactiveEmployeeManager;
    }

    @GetMapping("/inactiveAll")
    public List<InactiveEmployee> getInactiveAll() {
        return inactiveEmployeeManager.findAll();
    }

    @PostMapping
    public InactiveEmployee addInactiveEmployee(@RequestBody InactiveEmployee newInactiveEmployee) {
        return inactiveEmployeeManager.save(newInactiveEmployee);
    }
}
