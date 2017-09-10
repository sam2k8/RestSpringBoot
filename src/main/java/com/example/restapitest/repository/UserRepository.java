package com.example.restapitest.repository;

import com.example.restapitest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by SAM2k8 on 7/15/2017.
 */
@Repository()
public interface UserRepository extends JpaRepository<User,Long>{
    User findByEmail(String email);
}
