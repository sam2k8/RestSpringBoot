package com.example.restapitest.controller;

import com.example.restapitest.model.User;
import com.example.restapitest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;

/**
 * Created by SAM2k8 on 7/15/2017.
 */
@RestController
@Secured("ROLE_ADMIN")
public class LoginRestController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/api/users",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<User>> getUsers(){
    Collection<User> users= userService.findAll();
        return new ResponseEntity<Collection<User>>(users, HttpStatus.OK);
    }

}
