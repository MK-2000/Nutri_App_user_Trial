package com.group_4_trial_1.Nutri_App_user_Trial.repository;

import com.group_4_trial_1.Nutri_App_user_Trial.entity.Userdto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Userdto, Long> {

    // Postgres query -> SELECT user from user_table WHERE user_identification = ?;
    @Query("SELECT u FROM Userdto u WHERE u.userIdentification = ?1")
    Optional<Userdto> findByUserIdentification(String userIdentification);

//    @Query("DELETE from Userdto u WHERE u.userIdentification = ?1")
//    void deleteByuserId(String userId);

    @Query("SELECT u FROM Userdto u WHERE u.email = ?1")
    Optional<Userdto> findUserByemail(String email);
}
