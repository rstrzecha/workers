package com.example.interview_task.controller;

import com.example.interview_task.dao.ActiveEmployeeRepo;
import com.example.interview_task.entity.ActiveEmployee;
import com.example.interview_task.service.ActiveEmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ActiveEmployeeController {

    private ActiveEmployeeRepo activeEmployeeRepo;
    private ActiveEmployeeManager activeEmployeeManager;

    @Autowired
    public ActiveEmployeeController(ActiveEmployeeRepo activeEmployeeRepo, ActiveEmployeeManager activeEmployeeManager) {
        this.activeEmployeeRepo = activeEmployeeRepo;
        this.activeEmployeeManager = activeEmployeeManager;
    }

    @GetMapping("/activeAll")
    public List<ActiveEmployee> getActiveAll() {
        return activeEmployeeManager.findAll();
    }

    @PostMapping("/addActive")
    public ActiveEmployee addActiveEmployee(@RequestBody ActiveEmployee newEmployee) {
        return activeEmployeeManager.save(newEmployee);
    }

}
