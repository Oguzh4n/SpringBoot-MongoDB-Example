package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Create or Update User by ID
    @PostMapping("/user")
    public ResponseEntity<User> createOrUpdateUser(@RequestBody User user) {
        this.userService.createOrUpdateUser(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    // Get Users by name
    @GetMapping("/user")
    public ResponseEntity<List<User>> getUsers(@RequestParam("name") String name) {
        List<User> users = this.userService.getUsersByName(name);
        return new ResponseEntity<>(users, HttpStatus.FOUND);
    }

    // Delete User by ID
    @PostMapping("/user/delete")
    public ResponseEntity<String> deleteUser(@RequestParam("id") String id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(id, HttpStatus.NO_CONTENT);
    }
}