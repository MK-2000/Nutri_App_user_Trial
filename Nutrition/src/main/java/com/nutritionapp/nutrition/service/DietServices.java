package com.nutritionapp.nutrition.service;

import com.nutritionapp.nutrition.Entity.DietPlan;
import com.nutritionapp.nutrition.exception.DietPlanNotFoundException;

import java.util.List;

public interface DietServices {

    public DietPlan createDietPlan(DietPlan dietPlan);

    public DietPlan changeDietPlan(DietPlan dietPlan, int dietPlanId) throws DietPlanNotFoundException;

    public void removeDietPlan(int dietPlanId) throws DietPlanNotFoundException;

    public List<DietPlan> listAllPlan();

}
