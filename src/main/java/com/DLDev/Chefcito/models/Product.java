package com.DLDev.Chefcito.models;

import java.util.Objects;

import javax.measure.format.UnitFormat;

public class Product {
	
	private int id;
	private String name;
	private UnitFormat unit;
	
	public Product() {}
	
	public Product(String name, UnitFormat unit) {
		super();
		this.name = name;
		this.unit = unit;
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

	public void setUnit(UnitFormat unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", unit=" + unit + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, unit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id && Objects.equals(name, other.name) && Objects.equals(unit, other.unit);
	}

}
