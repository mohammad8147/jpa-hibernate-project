package com.jpahibernate.service;

import com.jpahibernate.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    User createUser(User user);

    User getUserById(Long userId);

    List<User> getAllUsers();

    User updateUser(User user);

    void deleteUser(Long userId);
}