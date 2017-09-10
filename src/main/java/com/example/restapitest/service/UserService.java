package com.example.restapitest.service;

import com.example.restapitest.model.User;

import java.util.Collection;

/**
 * Created by SAM2k8 on 7/15/2017.
 */
public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
    public Collection<User> findAll();
}
