package com.DLDev.Chefcito.models;

import java.util.Objects;

import javax.measure.MeasurementException;
import javax.measure.Quantity;
import javax.measure.format.UnitFormat;

import com.DLDev.Chefcito.entities.Product;

public class Ingredient extends Product {
	private int id;
	private String name;
	private Quantity<?> amount;
	
	
	public Ingredient() {}

	public Ingredient(String name,String unit) {
		this.name = name;
		this.setUnit(unit);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public UnitFormat getUnit() {
		return unit;
	}

	public void setUnit(String unit) throws MeasurementException { 
		this.unit.parse(unit);
		
	}

	@Override
	public String toString() {
		return "Ingredient [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ingredient other = (Ingredient) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}
