package com.realworld.realworld.controllers;

import com.realworld.realworld.repository.Profile;
import com.realworld.realworld.repository.User;
import org.springframework.web.bind.annotation.*;

@RestController("/api")
public class UserController {

    @PostMapping("/users/login")
    public User loginUser(@RequestBody User user) {
        return null;
    }

    @PostMapping("/users")
    public User registerUser(@RequestBody User user) {
        return null;
    }

    @GetMapping("/user")
    public User currentUser() {
        return null;
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {
        return null;
    }

    @GetMapping("/profiles/{username}")
    public Profile getProfile(@PathVariable String username) {
        return null;
    }

    @PostMapping("/profiles/{username}/follow")
    public Profile followProfile(@PathVariable String username) {
        return null;
    }

    @DeleteMapping("/profiles/{username}/follow")
    public Profile unfollowProfile(@PathVariable String username) {
        return null;
    }
}
