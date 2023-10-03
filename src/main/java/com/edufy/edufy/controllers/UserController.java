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

    // Get all users
    @GetMapping("/api/v1/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    // Get a users
    @GetMapping("/api/v1/users/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id")long id, @RequestBody User user){
        return ResponseEntity.ok(userService.getUser(user,id));
    }

    // Add a user
    @PostMapping("/api/v1/addUser")
    public ResponseEntity<User> addUser(@RequestBody User user){
        return new ResponseEntity<>(userService.addUser(user), HttpStatus.CREATED);
    }

    // update a user
    @PutMapping("/api/v1/updateUser/{id}")
    public ResponseEntity<User> updatedUser(@PathVariable("id")long id, @RequestBody User user) {
        return ResponseEntity.ok(userService.updateUser(user, id));
    }

    @DeleteMapping("/api/v1/removeUser/{id}")
    public ResponseEntity<String> removeUser(@PathVariable("id")long id){
        userService.removeUser(id);
        return new ResponseEntity<String>("User has been removed", HttpStatus.OK);
    }
}
