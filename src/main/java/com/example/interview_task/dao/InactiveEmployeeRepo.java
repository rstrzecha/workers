package com.example.interview_task.dao;

import com.example.interview_task.entity.InactiveEmployee;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

@Repository
public interface InactiveEmployeeRepo extends JpaRepositoryImplementation <InactiveEmployee, Long> {
}
