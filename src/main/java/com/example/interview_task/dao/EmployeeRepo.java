package com.example.interview_task.dao;

import com.example.interview_task.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    List<Employee> findByName(String name);
}
