package com.DLDev.Chefcito.models;

import java.util.Objects;

public class Steps {

	private int id;
	private int order;
	private String description;
	private Recipe recipe;
	
	public Steps() {}
	
	public Steps(int order, String description, Recipe recipe) {
		super();
		this.order = order;
		this.description = description;
		this.recipe = recipe;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	@Override
	public String toString() {
		return "Steps [order=" + order + ", description=" + description + ", recipe=" + recipe + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, id, order, recipe);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Steps other = (Steps) obj;
		return Objects.equals(description, other.description) && id == other.id && order == other.order
				&& Objects.equals(recipe, other.recipe);
	}
	
}
