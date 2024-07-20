package com.DLDev.Chefcito.controllers;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DLDev.Chefcito.entities.Recipe;
import com.DLDev.Chefcito.repositories.IRecipeRepository;

@RestController
@RequestMapping("api/v0.1")
public class HomeController {
	private IRecipeRepository recipeRepo;
	
	public HomeController(IRecipeRepository recipeRepo) {
		this.recipeRepo = recipeRepo;
	}
	
	
	@GetMapping
	public ResponseEntity<String> sayHello(){
		return ResponseEntity.ok("hello from secured endpoint");
	}
	
	
	@GetMapping("RecipeEditor")
	public ResponseEntity<String> RecipeEditor(@RequestBody String request){
		String recipeName = request;
		Optional<Recipe> rec = recipeRepo.getByTitle(recipeName);
		
		
		
		return ResponseEntity.ok(
				rec.toString());
	}
	
	
	@GetMapping("/home")
	public ResponseEntity<String> HomePage(){
		return ResponseEntity.ok("homePage");
	}
	
}
