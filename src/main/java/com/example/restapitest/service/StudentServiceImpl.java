package com.example.restapitest.service;

import com.example.restapitest.model.Student;
import com.example.restapitest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by SAM2k8 on 7/16/2017.
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Collection<Student> findAll() {
        System.out.println("hi service");
        Collection<Student> students= studentRepository.findAll();
        return students;
    }

    @Override
    public Student findOne(int id) {
       return studentRepository.findOne(id);
    }

    @Override
    public void createStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        studentRepository.save(student);
        return student;
    }

    @Override
    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }
}
