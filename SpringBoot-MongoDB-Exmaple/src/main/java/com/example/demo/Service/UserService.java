package com.example.demo.Service;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //Create
    public void createUser(User user) {
        userRepository.save(user);
    }

    //Read
    public List<User> getUsersByName(String name) {
        return userRepository.findByName(name);
    }

    //Update
    public void updateUser(String id, User user) {
        Optional<User> userInDb = userRepository.findById(id);
        userInDb.get().setAccountType(Optional.ofNullable(user.getAccountType()).orElse(userInDb.get().getAccountType()));
        userInDb.get().setEmail(Optional.ofNullable(user.getEmail()).orElse(userInDb.get().getEmail()));
        userInDb.get().setName(Optional.ofNullable(user.getName()).orElse(userInDb.get().getName()));
        userInDb.get().setSurname(Optional.ofNullable(user.getSurname()).orElse(userInDb.get().getSurname()));
        userInDb.get().setAddress(Optional.ofNullable(user.getAddress()).orElse(userInDb.get().getAddress()));
        userRepository.save(userInDb.get());
    }

    //Delete
    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

}
