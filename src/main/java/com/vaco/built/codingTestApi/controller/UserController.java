package com.vaco.built.codingTestApi.controller;

import com.vaco.built.codingTestApi.model.User;
import com.vaco.built.codingTestApi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/add")
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
