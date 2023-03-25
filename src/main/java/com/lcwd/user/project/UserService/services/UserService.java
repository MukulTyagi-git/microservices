package com.lcwd.user.project.UserService.services;

import com.lcwd.user.project.UserService.entities.User;

import java.util.List;

public interface UserService {

    //Creating User
    User saveUser(User user);
    //Getting All User
    List<User> getAllUser();
    // Getting User by UserId
    User getUser(String userId);
}
