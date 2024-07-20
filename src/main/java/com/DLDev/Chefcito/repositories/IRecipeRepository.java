package com.DLDev.Chefcito.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DLDev.Chefcito.entities.Recipe;

@Repository("recipeRepository")
public interface IRecipeRepository extends JpaRepository<Recipe, Integer>{
	
	Optional<Recipe> getByTitle(String name);

}
