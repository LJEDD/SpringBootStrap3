package com.example.SpringBootStrap3.service;

import com.example.SpringBootStrap3.model.User;
import java.util.List;

public interface UserService {
    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(long id);

    List<User> getAllUsers();

    User getUserByLogin(String login);

    User getUserById(long id);
}
