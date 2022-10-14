package com.group_4_trial_1.Nutri_App_user_Trial.service;

import com.group_4_trial_1.Nutri_App_user_Trial.entity.Userdto;
import com.group_4_trial_1.Nutri_App_user_Trial.entity.Userdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.group_4_trial_1.Nutri_App_user_Trial.repository.UserRepository;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;


    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Userdto> getUsers() {
        return userRepository.findAll();
    }

    public List<Userdto> getByUserId(Userdto user) {
        return userRepository.findAllById(Collections.singleton(user.getId()));
    }

    public void saveUser(Userdto user) {
        System.out.println(user);
    }
}
