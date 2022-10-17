package com.example.demo.repository;

import com.example.demo.entity.NutritionPlanDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NutritionPlanRepository
        extends JpaRepository<NutritionPlanDTO, Long> {

    // SELECT * FROM nutrition_planDTO where email= XYZ ;
    // @Query("SELECT n FROM nutrition_planDTO n where n.price= ?1")
    //Optional<NutritionPlanDTO> findNutritionPlanDTOByPrice(Double price);
}