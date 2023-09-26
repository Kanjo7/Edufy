package com.edufy.edufy.controllers;

import com.edufy.edufy.models.User;
import com.edufy.edufy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping("/api/v1/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/api/v1/users/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id")int id, @RequestBody User user){
        return ResponseEntity.ok(userService.getUser(user,id));
    }

    @PostMapping("/api/v1/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user){
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
    }

    @PutMapping("/api/v1/updateUser/{id}")
    public ResponseEntity<User> updatedUser(@PathVariable("id")int id, @RequestBody User user) {
        return ResponseEntity.ok(userService.updateUser(user, id));
    }
}
