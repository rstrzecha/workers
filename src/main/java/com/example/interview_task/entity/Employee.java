package com.example.interview_task.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="STATUS",discriminatorType=DiscriminatorType.STRING)
public class Employee{

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @ManyToMany
    @JoinTable(
            name = "employee_team",
            joinColumns = {@JoinColumn(name = "employee_id")},
            inverseJoinColumns = {@JoinColumn (name = "team_id")}
    )
    Set<Team> teams;

    @Column(length = 50)
    private String name;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
