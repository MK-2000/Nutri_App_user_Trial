package com.group_4_trial_1.Nutri_App_user_Trial.service;

import com.group_4_trial_1.Nutri_App_user_Trial.entity.Status;
import com.group_4_trial_1.Nutri_App_user_Trial.entity.User;
import com.group_4_trial_1.Nutri_App_user_Trial.exception.UserApiRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.group_4_trial_1.Nutri_App_user_Trial.repository.UserRepository;

import javax.transaction.Transactional;
import java.lang.reflect.Type;
import java.sql.Time;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;


    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

//    public List<Userdto> getByUserId(Userdto user) {
//        return userRepository.findAll();
//    }
    public User getUserByUserId(String userId) {
        boolean exist = userRepository.findByUserIdentification(userId).isPresent();
        if(!exist) {
            throw new UserApiRequestException("User with " + userId + " is not present in database right now !");
        }
       return userRepository.findByUserIdentification(userId).get();
    }

    public void registerUser(User user) {
        Optional<User> optionalUser = userRepository
                                        .findByUserIdentification(user.getUserIdentification());
        if(optionalUser.isPresent()) {
            throw new UserApiRequestException("User is already present in the Database !");
//            throw new IllegalStateException("User is already present in the Database !");
        }
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
//        boolean exist = userRepository.existsById(id);
        boolean exist = userRepository.findById(id).isPresent();

        if (!exist) {
            throw new UserApiRequestException("User is not present in the database ! Please try with different User Id !");
//            throw new IllegalStateException("User is not present in the database ! Please try with different User Id !");
        }
        userRepository.deleteById(id);

    }

    @Transactional
    public void updateUser(Long id, String name, String contact, String email, String gender, Status status, Float weight,
                           Float height, String goal, Time wakeUpTime, Time sleepTime) {
            User user = userRepository.findById(id).orElseThrow(() -> new IllegalStateException(
                    "User with this id is not present in the database."
        ));
            if(name != null && name.length() > 0 && !Objects.equals(name, user.getName())) {
                user.setName(name);
            }

            if(contact != null && contact.length() == 10 && !Objects.equals(contact, user.getContact())) {
                user.setContact(contact);
            }

            if(email != null && email.length() > 0 && email.contains("@") && email.contains(".")
                    && Objects.equals(email, user.getEmail())) {
                Optional<User> optionalUser = userRepository.findUserByemail(email);
                if(optionalUser.isPresent()) {
                    throw new UserApiRequestException("User with same email is already present in the database!");
//                    throw new IllegalStateException("User with same email is already present in the database!");
                }
                user.setEmail(email);
            }

//            if(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female") || !gender.equals(null)){
//                user.setGender(gender);
//            }
//
            if(status == Status.ACTIVE || status == Status.INACTIVE ||
                    status == Status.BLOCKED && status != user.getStatus()) {
                user.setStatus(status);
            }
//
//            if(weight > 0f) {
//                user.setWeight(weight);
//            }
//            if(height > 0f) {
//                user.setHeight(height);
//            }
//
//            if(goal != null && goal.length() > 0 && !Objects.equals(goal, user.getGoal())) {
//                user.setGoal(goal);
//            }
//
//            if(wakeUpTime != null) {
//                user.setWakeUpTime(wakeUpTime);
//            }
//            if(sleepTime != null) {
//                user.setSleepTime(sleepTime);
//            }
    }
}
