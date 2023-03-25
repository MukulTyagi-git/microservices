package com.lcwd.user.project.UserService.repository;

import com.lcwd.user.project.UserService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {


}
