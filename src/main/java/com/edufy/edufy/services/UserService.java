package com.edufy.edufy.services;

import com.edufy.edufy.models.User;
import com.edufy.edufy.repositories.UserRepository;
import com.edufy.edufy.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceInterface {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private VideoRepository videoRepository;

    //Get all users
    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    //Get a user
    @Override
    public User getUser(User user, int id) {
        return userRepository.findById(id).orElseThrow();
    }

    //add a user
    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    //Update a user
    @Override
    public User updateUser(User user, int id) {
        User u = userRepository.findById(id).orElseThrow();
        u.setUsername(u.getUsername());
        u.setName(u.getName());
        u.setEmail(u.getEmail());
        userRepository.save(u);
        return u;
    }

    @Override
    public void removeUser(int id) {
        userRepository.findById(id).orElseThrow();
        videoRepository.deleteById(id);
    }
}
