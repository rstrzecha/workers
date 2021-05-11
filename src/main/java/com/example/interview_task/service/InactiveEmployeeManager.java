package com.example.interview_task.service;

import com.example.interview_task.dao.InactiveEmployeeRepo;
import com.example.interview_task.entity.InactiveEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InactiveEmployeeManager {

    private InactiveEmployeeRepo inactiveEmployeeRepo;

    @Autowired
    public InactiveEmployeeManager(InactiveEmployeeRepo inactiveEmployeeRepo) {
        this.inactiveEmployeeRepo = inactiveEmployeeRepo;
    }

    public List<InactiveEmployee> findAll() {
        return inactiveEmployeeRepo.findAll();
    }

    public Optional<InactiveEmployee> findById(Long givenId) {
        return inactiveEmployeeRepo.findById(givenId);
    }

    public InactiveEmployee save(InactiveEmployee inactiveEmployee) {
        return inactiveEmployeeRepo.save(inactiveEmployee);
    }

    public void deleteById(Long givenId) {
        inactiveEmployeeRepo.deleteById(givenId);
    }
}
