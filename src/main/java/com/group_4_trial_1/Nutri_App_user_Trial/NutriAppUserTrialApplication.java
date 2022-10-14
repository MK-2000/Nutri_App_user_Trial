package com.group_4_trial_1.Nutri_App_user_Trial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EntityScan
//@RestController
public class NutriAppUserTrialApplication {

	public static void main(String[] args) {
		SpringApplication.run(NutriAppUserTrialApplication.class, args);
	}

}
