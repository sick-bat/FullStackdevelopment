package com.ani.crud.service;

import java.util.List;

import com.ani.crud.domain.User;

import com.ani.crud.domain.User;

public interface UserService {

    Integer createUser(User user);

    List<User> readAllUsers();

    User readUserById(long id);

    Integer updateUser(User user);

    Integer deleteUserById(long id);
}