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

    // Create User by ID
    @PostMapping("/user")
    public ResponseEntity<User> createOrUpdateUser(@RequestBody User user) {
        this.userService.createUser(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    // Get Users by name
    @GetMapping("/user")
    public ResponseEntity<List<User>> getUser(@RequestParam("name") String name) {
        List<User> users = this.userService.getUsersByName(name);
        return new ResponseEntity<>(users, HttpStatus.FOUND);
    }

    // Update User by ID
    @PutMapping("/user/update")
    public ResponseEntity<User> UpdateUser(@RequestParam("id") String id, @RequestBody User user) {
        userService.updateUser(id, user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    // Delete User by ID
    @DeleteMapping("/user/delete")
    public ResponseEntity<String> deleteUser(@RequestParam("id") String id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
