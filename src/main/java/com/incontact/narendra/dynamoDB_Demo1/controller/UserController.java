package com.incontact.narendra.dynamoDB_Demo1.controller;

import com.incontact.narendra.dynamoDB_Demo1.model.User;
import com.incontact.narendra.dynamoDB_Demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Narendra Kalekar on 7/11/2017.
 */

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/user/{uname}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUser(@PathVariable("uname") String uname) {
        User user = userService.findByUserName(uname);
        if (user == null) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.FOUND);
    }

    @PostMapping(value = "/newuser",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> createUser(@RequestBody User user){
        userService.createUser(user);
        return new ResponseEntity<User>(user,HttpStatus.CREATED);
    }

    @PutMapping(value = "/user/{uname}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> updateUser(@RequestBody User user){
        userService.updateUser(user);
        return new ResponseEntity<User>(user,HttpStatus.OK);
    }

    @DeleteMapping(value = "/user/{uname}")
    public ResponseEntity<User> deleteUser(@PathVariable("uname") String uname){
        userService.deleteUser(uname);
        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
    }
}
