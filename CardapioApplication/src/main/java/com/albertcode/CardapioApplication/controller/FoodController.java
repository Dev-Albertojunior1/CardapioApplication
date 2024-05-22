package com.albertcode.CardapioApplication.controller;

import com.albertcode.CardapioApplication.model.Food;
import com.albertcode.CardapioApplication.model.FoodRequestDTO;
import com.albertcode.CardapioApplication.model.FoodResponseDTO;
import com.albertcode.CardapioApplication.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository foodRepository;

//    @PostMapping("/post")
//    Food newFood(@RequestBody Food newFood){
//        return foodRepository.save(newFood);
//    }

    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        foodRepository.save(foodData);
        return;
    }

    @GetMapping
    public List<FoodResponseDTO> getAll(){
    List<FoodResponseDTO> foodList = foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
    return foodList;
    }

}
