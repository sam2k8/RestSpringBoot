package com.example.restapitest.repository;

import com.example.restapitest.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by SAM2k8 on 7/16/2017.
 */
@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
