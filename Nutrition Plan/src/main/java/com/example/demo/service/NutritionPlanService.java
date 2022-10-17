package com.example.demo.service;

import com.example.demo.entity.NutritionPlanDTO;
import com.example.demo.repository.NutritionPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;


@Service
public class NutritionPlanService {

    private final NutritionPlanRepository nutritionPlanRepository;

    public NutritionPlanService(NutritionPlanRepository nutritionPlanRepository) {
        this.nutritionPlanRepository = nutritionPlanRepository;
    }

    @Autowired
    public List<NutritionPlanDTO> getNutritionPlans(){
        return nutritionPlanRepository.findAll();
    }

    public void addNewNutritionPlanDTO(NutritionPlanDTO nutritionPlanDTO) {
   /*    Optional<NutritionPlanDTO> findNutritionPlanDTOByEmail = nutritionPlanRepository.
                findNutritionPlanDTOByEmail(nutritionPlanDTO.getEmail())
        if(nutritionPlanDTOOptional.isPresent()){
            throw new IllegalStateException("Email Taken");
        }*/
        nutritionPlanRepository.save(nutritionPlanDTO);
        System.out.println(nutritionPlanDTO);
    }


    public void deleteNutritionPlanDTO(Long nutritionPlanDTOId) {
         boolean exists = nutritionPlanRepository.existsById(nutritionPlanDTOId);
         if(!exists){
             throw new IllegalStateException("Nutrition Plan for id "
                     + nutritionPlanDTOId + " does not exits");
         }
         nutritionPlanRepository.deleteById(nutritionPlanDTOId);
    }

    @Transactional
    public void updateNutritionPlanDTO(Long nutritionPlanDTOId,
                                       String name,
                                       Double price , String planDiscription ) {
        NutritionPlanDTO nutritionPlanDTO = nutritionPlanRepository.findById(nutritionPlanDTOId).
                orElseThrow(() -> new IllegalStateException(
                        "Nutrition Plan with id " + nutritionPlanDTOId + " does not exists"));
                if(name != null && name.length() > 0 &&
                !Objects.equals(nutritionPlanDTO.getName(),name)){
                    nutritionPlanDTO.setName(name);
                }
        if(price!= null  &&
                !Objects.equals(nutritionPlanDTO.getPrice(),price)){
            nutritionPlanDTO.setPrice(price);
        }
        if(planDiscription!= null  &&
                !Objects.equals(nutritionPlanDTO.getPlanDiscription(),planDiscription)){
            nutritionPlanDTO.setPlanDiscription(planDiscription);
        }
       /*  if(created_At!= null  &&
                !Objects.equals(nutritionPlanDTO.getCreated_At(),created_At)){
            nutritionPlanDTO.setCreated_At(created_At);
        }
        if(updated_At!= null  &&
                !Objects.equals(nutritionPlanDTO.getUpdated_At(),updated_At)){
            nutritionPlanDTO.setUpdated_At(updated_At);
        }*/
    }
}
