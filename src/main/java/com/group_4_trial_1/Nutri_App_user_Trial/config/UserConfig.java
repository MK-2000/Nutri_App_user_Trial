package com.group_4_trial_1.Nutri_App_user_Trial.config;

import com.group_4_trial_1.Nutri_App_user_Trial.entity.Userdto;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.group_4_trial_1.Nutri_App_user_Trial.repository.UserRepository;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class UserConfig {

    @Bean
    CommandLineRunner commandLineRunner(UserRepository repository) {
        return args -> {
            Userdto mariam = new Userdto(
                    "mariam007",
                "Mariam",
                    "9564525874",
                    "Female",
                    LocalDate.of(1999, JANUARY, 1)
            );

            Userdto alex = new Userdto(
                    "alex009",
                    "Alex",
                    "8975469871",
                    "Male",
                    LocalDate.of(2004, JANUARY, 1)
            );

            repository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
