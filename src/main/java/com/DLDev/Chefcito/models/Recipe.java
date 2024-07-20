package com.DLDev.Chefcito.models;

import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.measure.Quantity;

public class Recipe {

	private int id;
	private String title;
	private String description;

	private Map<Ingredient, Quantity<?>> ingredients;

	private List<String> steps;

	public Recipe() {}

	public Recipe(String title, String description, Map<Ingredient, Quantity<?>> ingredients, List<String> steps) {
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

	public Map<Ingredient, Quantity<?>> getIngredients() {
		return ingredients;
	}

	public void setIngredients(Map<Ingredient, Quantity<?>> ingredients) {
		this.ingredients = ingredients;
	}

	public List<String> getSteps() {
		return steps;
	}

	public void setSteps(List<String> steps) {
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
