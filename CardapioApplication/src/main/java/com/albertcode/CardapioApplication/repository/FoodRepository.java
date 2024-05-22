package com.albertcode.CardapioApplication.repository;

import com.albertcode.CardapioApplication.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food,Long> {

}
