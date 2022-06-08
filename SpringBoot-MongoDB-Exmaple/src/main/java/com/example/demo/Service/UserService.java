package com.example.demo.Service;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //Create or Update
    public void createOrUpdateUser(User user) {
        userRepository.save(user);
    }

    //Read
    public List<User> getUsersByName(String name) {
        return userRepository.findByName(name);
    }

    //Delete
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
}
