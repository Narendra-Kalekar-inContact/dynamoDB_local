package com.incontact.narendra.dynamoDB_Demo1.service;

import com.incontact.narendra.dynamoDB_Demo1.dao.UserRepository;
import com.incontact.narendra.dynamoDB_Demo1.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Narendra Kalekar on 7/11/2017.
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User findByUserName(String name) {
        User user = userRepository.findOne(name);
        return user;
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(String name) {
        userRepository.delete(name);
    }


}
