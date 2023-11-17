package com.DLDev.Chefcito.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DLDev.Chefcito.entities.Ingredient;

public interface IIngredientRepository extends JpaRepository<Ingredient, Integer>{

}
