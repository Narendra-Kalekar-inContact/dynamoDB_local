package com.incontact.narendra.dynamoDB_Demo1.service;

import com.incontact.narendra.dynamoDB_Demo1.model.User;
import org.springframework.stereotype.Component;

/**
 * Created by Narendra Kalekar on 7/11/2017.
 */
@Component
public interface UserService {

    User findByUserName(String name);

    void createUser(User user);

    void updateUser(User user);

    void deleteUser(String name);
}
