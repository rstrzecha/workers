package com.example.interview_task.entity;

import javax.persistence.*;

@Entity
@Table
public class Employee {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Column(length = 50)
    private String name;


}
