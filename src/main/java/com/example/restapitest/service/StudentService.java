package com.example.restapitest.service;

import com.example.restapitest.model.Student;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by SAM2k8 on 7/16/2017.
 */

public interface StudentService {
    public Collection<Student> findAll();
    public Student findOne(int id);
    public void createStudent(Student student);
    public Student updateStudent(Student student);
    public void deleteStudent(Student student);
}
