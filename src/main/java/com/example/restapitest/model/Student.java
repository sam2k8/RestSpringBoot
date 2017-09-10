package com.example.restapitest.model;

import javax.persistence.*;

/**
 * Created by SAM2k8 on 7/16/2017.
 */
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "roll")
    private int roll;
    @Column(name = "department")
    private String department;

    public int getId() {
        return id;
    }

    public Student setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getRoll() {
        return roll;
    }

    public Student setRoll(int roll) {
        this.roll = roll;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public Student setDepartment(String department) {
        this.department = department;
        return this;
    }
}
