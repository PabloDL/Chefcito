package com.DLDev.Chefcito.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DLDev.Chefcito.models.Recipe;
import com.DLDev.Chefcito.repositories.IRecipeRepository;
import com.DLDev.Chefcito.services.implementation.RecipeService;

@RestController
@RequestMapping("recipe")
public class RecipeController {
	
	RecipeService service = new RecipeService();
	
	@PostMapping("/createFromJson")
	public void CreateRecipeFromJson(@RequestBody String request){
		try {
			Recipe recipe = service.parseJsonRecipe(request);
			
		}
		catch (Exception e) {
	
		}		
	}
	
	@PostMapping("/create")
	public void CreateRecipe(@RequestBody String request){
		try {
			Recipe recipe = service.parseJsonRecipe(request);
			System.out.println(recipe.toString());
		}
		catch (Exception e) {
	
		}		
	}
}
