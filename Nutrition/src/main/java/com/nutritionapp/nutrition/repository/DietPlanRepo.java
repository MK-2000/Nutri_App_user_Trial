package com.nutritionapp.nutrition.repository;

import com.nutritionapp.nutrition.Entity.DietPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DietPlanRepo extends JpaRepository<DietPlan, Integer> {
    Optional<DietPlan> findDietPlanById(int id);
}
