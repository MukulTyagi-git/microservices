package com.lcwd.user.project.UserService.impl;

import com.lcwd.user.project.UserService.entities.User;
import com.lcwd.user.project.UserService.exception.UserNotFoundException;
import com.lcwd.user.project.UserService.repository.UserRepository;
import com.lcwd.user.project.UserService.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        //Generate Unique ID
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {

        return userRepository.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepository.findById(userId).orElseThrow(()-> new UserNotFoundException("User with given id not found in DB" +userId));
    }
}
