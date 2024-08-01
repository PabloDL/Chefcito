package com.DLDev.Chefcito.services.implementation;



import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.DLDev.Chefcito.models.Recipe;

@Service
public class RecipeService {
	
	public Recipe parseJsonRecipe(String JsonObject) {
		ObjectMapper mapper = new ObjectMapper();
		Recipe newRecipe = null;
		try {
			newRecipe = mapper.readValue(JsonObject, Recipe.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("parsed!");
			System.out.println(newRecipe.toString());
		}
		return newRecipe;
	}

	
	public void saveRecipe(Recipe recipe) {
		
	}
}

