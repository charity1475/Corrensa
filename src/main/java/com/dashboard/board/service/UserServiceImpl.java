package com.dashboard.board.service;

import com.dashboard.board.model.User;
import com.dashboard.board.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public User findByName(String name) {
        return userRepository.findByName(name);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(Optional<User> user){
        saveUser(user);
    }

    public void deleteUserById(Long id){
        userRepository.delete(id);
    }

    public void deleteAllUsers(){
        userRepository.deleteAll();
    }

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public boolean isUserExist(User user) {
        return findByName(user.getName()) != null;
    }

}
