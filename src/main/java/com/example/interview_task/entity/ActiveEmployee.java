package com.example.interview_task.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("Active")
public class ActiveEmployee {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private Double salary;
    private LocalDate dateOfEmployment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(LocalDate dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }
}
