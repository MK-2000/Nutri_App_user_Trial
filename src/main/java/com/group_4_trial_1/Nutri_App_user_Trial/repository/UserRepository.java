package com.group_4_trial_1.Nutri_App_user_Trial.repository;

import com.group_4_trial_1.Nutri_App_user_Trial.entity.Userdto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Userdto, Long> {
}
