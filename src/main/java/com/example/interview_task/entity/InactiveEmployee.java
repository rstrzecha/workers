package com.example.interview_task.entity;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Inactive")
public class InactiveEmployee extends Employee {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    public InactiveEmployee() {
    }

    public InactiveEmployee(String name) {
        super(name);
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }
}
