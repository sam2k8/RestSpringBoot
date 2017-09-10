package com.example.restapitest.controller;

import com.example.restapitest.model.Student;
import com.example.restapitest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by SAM2k8 on 7/16/2017.
 */
@RestController
@Secured("ROLE_ADMIN")
public class StudentRestController {
    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/api/students",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<Student>> getStudents() {
        System.out.println("hi controller");
        Collection<Student> students = studentService.findAll();

        return new ResponseEntity<Collection<Student>>(students, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/student/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> getStudent(@PathVariable("id") Integer id) {
        System.out.println(id);
        Student student = studentService.findOne(id);

        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }

    @RequestMapping(
            value = "/api/students",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> createStudent(
            @RequestBody Student student) {
        studentService.createStudent(student);
        return new ResponseEntity<Student>(student, HttpStatus.CREATED);
    }

    @RequestMapping(
            value = "/api/students/{id}",
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> updateStudent(
            @PathVariable("id") int id, @RequestBody Student student) {
        Student currStudent=studentService.findOne(id);
        if (currStudent == null) {
            return new ResponseEntity("Unable to upate. User with id " + id + " not found.", HttpStatus.NOT_FOUND);
        }
        studentService.updateStudent(student);
        return new ResponseEntity<Student>(currStudent, HttpStatus.OK);
    }
    @RequestMapping(
            value = "/api/students/{id}",
            method = RequestMethod.DELETE,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> deleteStudent(
            @PathVariable("id") int id) {
        Student student=studentService.findOne(id);
        if (student == null) {
            return new ResponseEntity("Can't find Desire Student", HttpStatus.NOT_FOUND);
        }
        studentService.deleteStudent(student);
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }
}
