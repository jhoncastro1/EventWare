package com.example.eventware.service;

import com.example.eventware.entities.User;

import java.util.List;

public interface IUserService {

    User findById(long id);

    List<User> findAllUsers();
}
