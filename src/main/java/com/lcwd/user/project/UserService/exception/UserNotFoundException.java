package com.lcwd.user.project.UserService.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(){

        super("User not found in DB");

    }
    public UserNotFoundException(String message)
    {
        super(message);
    }
}
