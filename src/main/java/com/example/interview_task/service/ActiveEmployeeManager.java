package com.example.interview_task.service;

import com.example.interview_task.dao.ActiveEmployeeRepo;
import com.example.interview_task.entity.ActiveEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActiveEmployeeManager {

    private ActiveEmployeeRepo activeEmployeeRepo;

    @Autowired
    public ActiveEmployeeManager(ActiveEmployeeRepo activeEmployeeRepo) {
        this.activeEmployeeRepo = activeEmployeeRepo;
    }

    public List<ActiveEmployee> findAll() {
        return activeEmployeeRepo.findAll();
    }

    public Optional<ActiveEmployee> findById(Long givenId) {
        return activeEmployeeRepo.findById(givenId);
    }

    public ActiveEmployee save(ActiveEmployee givenActiveEmployee) {
        return activeEmployeeRepo.save(givenActiveEmployee);
    }

    public void deleteById(Long givenId) {
        activeEmployeeRepo.deleteById(givenId);
    }
}
