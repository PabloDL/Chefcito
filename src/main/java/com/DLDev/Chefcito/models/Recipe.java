package com.DLDev.Chefcito.models;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.measure.Quantity;

public class Recipe {

	private int id;
	private String title;
	private String description;
	private List<Ingredient> ingredients;
	private Map<Integer, String> steps;
	
	public Recipe() {}

	public Recipe(String title, String description) {
		this.title = title;
		this.description = description;
	}
	
	public Recipe(String title, String description, List<Ingredient> ingredients, Map<Integer, String> steps) {
		this.title = title;
		this.description = description;
		this.ingredients = ingredients;
		this.steps = steps;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	public Map<Integer, String> getSteps() {
		return steps;
	}

	public void setSteps(Map<Integer, String> steps) {
		this.steps = steps;
	}

	@Override
	public String toString() {
		return "Recipe [id=" + id + ", title=" + title + ", description=" + description + ", ingredients=" + ingredients
				+ ", steps=" + steps + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, id, ingredients, steps, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recipe other = (Recipe) obj;
		return Objects.equals(description, other.description) && id == other.id
				&& Objects.equals(ingredients, other.ingredients) && Objects.equals(steps, other.steps)
				&& Objects.equals(title, other.title);
	}

}
