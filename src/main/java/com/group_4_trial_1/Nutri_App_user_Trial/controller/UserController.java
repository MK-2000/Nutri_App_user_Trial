package com.group_4_trial_1.Nutri_App_user_Trial.controller;

import com.group_4_trial_1.Nutri_App_user_Trial.entity.Userdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.group_4_trial_1.Nutri_App_user_Trial.service.UserService;

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
    public List<Userdto> getUsers(){
        return userService.getUsers();
    }

    @PostMapping
    public void saveUser(@RequestBody Userdto user) {
        userService.saveUser(user);
    }
}
