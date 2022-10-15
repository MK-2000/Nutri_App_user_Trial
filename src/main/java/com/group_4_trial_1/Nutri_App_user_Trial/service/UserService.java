package com.group_4_trial_1.Nutri_App_user_Trial.service;

import com.group_4_trial_1.Nutri_App_user_Trial.entity.Userdto;
import com.group_4_trial_1.Nutri_App_user_Trial.entity.Userdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.group_4_trial_1.Nutri_App_user_Trial.repository.UserRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

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

//    public List<Userdto> getByUserId(Userdto user) {
//        return userRepository.findAll();
//    }

    public void registerUser(Userdto user) {
        Optional<Userdto> optionalUser = userRepository
                                        .findByUserIdentification(user.getUserIdentification());
        if(optionalUser.isPresent()) {
            throw new IllegalStateException("User is already present in the Database !");
        }
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
//        boolean exist = userRepository.existsById(id);
        boolean exist = userRepository.findById(id).isPresent();

        if (!exist) {
            throw new IllegalStateException("User is not present in the database ! Please try with different User Id !");
        }
        userRepository.deleteById(id);

    }
}
