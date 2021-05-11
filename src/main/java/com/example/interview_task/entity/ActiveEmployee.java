package com.example.interview_task.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("Active")
public class ActiveEmployee extends Employee {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private Double salary;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfEmployment;

    public ActiveEmployee() {
    }

    public ActiveEmployee(String name, Long id, Double salary, LocalDate dateOfEmployment) {
        super(name);

        this.id = id;
        this.salary = salary;
        this.dateOfEmployment = dateOfEmployment;
    }

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
