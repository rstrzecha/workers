package com.example.interview_task.dao;

import com.example.interview_task.entity.ActiveEmployee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActiveEmployeeRepo extends JpaRepository <ActiveEmployee, Long> {
}
