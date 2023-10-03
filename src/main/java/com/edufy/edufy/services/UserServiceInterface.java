package com.edufy.edufy.services;

import com.edufy.edufy.models.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserServiceInterface {
    List<User> getAllUsers();

    User getUser(User user, long id);

    User addUser(User user);

    User updateUser(User user, long id);

    void removeUser(long id);
}
