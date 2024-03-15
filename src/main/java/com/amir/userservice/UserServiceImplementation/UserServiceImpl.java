package com.amir.userservice.UserServiceImplementation;

import com.amir.userservice.Entity.User;
import com.amir.userservice.Exception.ResourceNotFoundException;
import com.amir.userservice.Repositories.UserRepo;
import com.amir.userservice.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User getUser(Integer userId) {
        return userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User not found " + userId));
    }

    @Override
    public User deleteUser(Integer userId) {
        return null;
    }

    @Override
    public User updateUser(User user) {
        return null;
    }
}
