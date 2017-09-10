package com.example.restapitest.repository;

import com.example.restapitest.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by SAM2k8 on 7/15/2017.
 */
@Repository()
public interface RoleRepository extends JpaRepository<Role,Integer> {
    Role findByRole(String role);
}
