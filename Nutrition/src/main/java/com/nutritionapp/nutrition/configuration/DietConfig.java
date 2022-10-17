package com.nutritionapp.nutrition.configuration;

import com.nutritionapp.nutrition.Entity.DietPlan;
import com.nutritionapp.nutrition.repository.DietPlanRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DietConfig {
    @Bean
    CommandLineRunner commandLineRunner(DietPlanRepo dietPlanRepo){
        return args -> {
                   DietPlan diet1 = new DietPlan("yuuyrfu","hjvjhvhj",
                           "jhvjh","ghccjhchc","fuyfyuf",
                           "uyfuyfyf","jjuvuivu");
            DietPlan diet2 = new DietPlan("yuuyrfu","hjvjhvhj",
                    "jhvjh","ghccjhchc","fuyfyuf",
                    "uyfuyfyf","jjuvuivu");
            dietPlanRepo.saveAll(List.of(diet1,diet2));
        };

    }
}
