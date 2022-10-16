package com.group_4_trial_1.Nutri_App_user_Trial.controller;

import com.group_4_trial_1.Nutri_App_user_Trial.entity.Status;
import com.group_4_trial_1.Nutri_App_user_Trial.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.group_4_trial_1.Nutri_App_user_Trial.service.UserService;

import java.sql.Time;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(path = "{userId}")
    public User getUserById(@PathVariable("userId") String userId) {
        return userService.getUserByUserId(userId);
    }

    @PostMapping
    public void saveUser(@RequestBody User user) {
        userService.registerUser(user);
    }

    @DeleteMapping(path = "{id}")
    public void deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
    }

    @PutMapping(path = "{id}")
    public void updateUser(
            @PathVariable("id") Long id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String contact,
            @RequestParam(required = false) String email,
            @RequestParam(required = false) String gender,
            @RequestParam(required = false) Status status,
            @RequestParam(required = false) Float weight,
            @RequestParam(required = false) Float height,
            @RequestParam(required = false) String goal,
            @RequestParam(required = false) Time wakeUpTime,
            @RequestParam(required = false) Time sleepTime
            ) {
        userService.updateUser(id, name, contact, email, gender, status, weight, height, goal, wakeUpTime, sleepTime);
    }

}
