package com.ani.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ani.crud.domain.User;
import com.ani.crud.dto.AppRes;
import com.ani.crud.service.UserService;

// http://localhost:8080/user
@RequestMapping(value = "/user")
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    
    // POST - http://localhost:8080/user/
    @PostMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<AppRes> createUser(@RequestBody User user) {

        userService.createUser(user);

        AppRes res = AppRes.builder()
                            .sts("success")
                            .msg("New User created")
                            .build();


        return ResponseEntity.status(HttpStatus.CREATED).body(res);
    }

    // GET - http://localhost:8080/user/
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<List<User>> readAllUsers() {
        List<User> users = userService.readAllUsers();
        return ResponseEntity.status(HttpStatus.OK).body(users);
    }

    // GET - http://localhost:8080/user/{id}
    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<User> readUserById(@PathVariable Integer id) {
        User user = userService.readUserById(id);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    // PUT - http://localhost:8080/user/
    @PutMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<AppRes> updateUser(@RequestBody User user) {

        userService.updateUser(user);

        AppRes res = AppRes.builder()
                            .sts("success")
                            .msg("User Updated")
                            .build();

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(res);
    }

     // DELETE - http://localhost:8080/user/{id}

}
