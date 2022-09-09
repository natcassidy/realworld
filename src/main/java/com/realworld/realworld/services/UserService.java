package com.realworld.realworld.services;

import com.realworld.realworld.repository.User;
import com.realworld.realworld.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class UserService {

    @Autowired
    public UserDAO userDAO;

    public List<User> findAllUsers() {
        return userDAO.findAll();
    }

    public Optional<User> findUserById(String id) {
        return userDAO.findById(id);
    }

    public void createUser(User user) {
        userDAO.save(user);
    }

    public void updateUser(User user) {
        userDAO.save(user);
    }

    public void deleteUser(String id) {
        userDAO.deleteById(id);
    }
}
