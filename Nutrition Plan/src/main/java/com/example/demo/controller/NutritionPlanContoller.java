package com.example.demo.controller;

import com.example.demo.entity.NutritionPlanDTO;
import com.example.demo.service.NutritionPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/nutritionplan")
public class NutritionPlanContoller {

    private final NutritionPlanService nutritionPlanService;

    @Autowired
    public NutritionPlanContoller(NutritionPlanService nutritionPlanService) {
        this.nutritionPlanService = nutritionPlanService;
    }

    @GetMapping
    public List<NutritionPlanDTO> getNutritionPlans(){
   // throw new NutritionPlanApiRequestException("Oops cannot get all Nutrition Plans with custom exception");
    //throw new IllegalStateException("Oops cannot get all Nutrition Plans");
       return  nutritionPlanService.getNutritionPlans();
    }

    @PostMapping
    public void registerNewNutritionPlan(@RequestBody NutritionPlanDTO nutritionPlanDTO){
        nutritionPlanService.addNewNutritionPlanDTO(nutritionPlanDTO);
    }
    @DeleteMapping(path = "{nutritionPlanDTOId}")
    public void deleteNutritionPlanDTO(
            @PathVariable("nutritionPlanDTOId") Long nutritionPlanDTOId){
        nutritionPlanService.deleteNutritionPlanDTO(nutritionPlanDTOId);
    }

    @PutMapping(path = "{nutritionPlanDTOId}")
    public void updateNutritionPlanDTO(
            @PathVariable("nutritionPlanDTOId") Long nutritionPlanDTOId ,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String planDiscription,

           // @RequestParam(required = false) LocalDate created_At,
            //@RequestParam(required = false) LocalDate updated_At,

            @RequestParam(required = false) Double price) {
        nutritionPlanService.updateNutritionPlanDTO(nutritionPlanDTOId ,name
                ,price,planDiscription);
    }
}
