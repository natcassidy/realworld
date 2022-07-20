package com.realworld.realworld.controllers;

import com.realworld.realworld.repository.Profile;
import com.realworld.realworld.repository.User;
import org.springframework.web.bind.annotation.*;

@RestController("/api")
public class UserController {

    @PostMapping("/users/login")
    public User loginUser(@RequestBody User user) {}

    @PostMapping("/users")
    public User registerUser(@RequestBody User user) {}

    @GetMapping("/user")
    public User currentUser() {}

    @PutMapping("/user")
    public User updateUser(@RequestBody User user) {}

    @GetMapping("/profiles/{username}")
    public Profile getProfile(@PathVariable String username) {}

    @PostMapping("/profiles/{username}/follow")
    public Profile followProfile(@PathVariable String username) {}

    @DeleteMapping("/profiles/{username}/follow")
    public Profile unfollowProfile(@PathVariable String username)
}
