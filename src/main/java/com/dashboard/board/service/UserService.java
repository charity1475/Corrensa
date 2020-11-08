package com.dashboard.board.service;

import com.dashboard.board.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> findById(Long id);

    User findByName(String name);

    void saveUser(User user);

    void updateUser(Optional<User> user);

    void deleteUserById(Long id);

    void deleteAllUsers();

    List<User> findAllUsers();

    boolean isUserExist(User user);
}
