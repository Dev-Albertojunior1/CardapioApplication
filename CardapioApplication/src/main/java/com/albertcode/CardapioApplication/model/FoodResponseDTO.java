package com.albertcode.CardapioApplication.model;

public record FoodResponseDTO(Long id, String title, String image,Integer price) {

    public FoodResponseDTO(Food food){

        this(food.getId(), food.getImage(), food.getTitle(), food.getPrice());
    }
}
