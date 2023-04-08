package com.ani.crud.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ani.crud.domain.User;
import com.ani.crud.repository.UserRepository;

@Service
public class UserServiceMongo implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public Integer createUser(User user) {
        repository.save(user);
        return 0;
    }

    @Override
    public List<User> readAllUsers() {
        return (List<User>) repository.findAll();
    }

    @Override
    public User readUserById(long id) {
        return repository.findById(id);
    }

    @Override
    public Integer updateUser(User user) {
        repository.save(user);
        return 0;
    }

    @Override
    public Integer deleteUserById(long id) {
        repository.deleteById(id);
        return 0;
    }
}
