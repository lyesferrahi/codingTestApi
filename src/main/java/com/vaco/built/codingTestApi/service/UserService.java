package com.vaco.built.codingTestApi.service;

import com.vaco.built.codingTestApi.model.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public List<User> getAllUsers();
}
