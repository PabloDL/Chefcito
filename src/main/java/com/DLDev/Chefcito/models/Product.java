package com.DLDev.Chefcito.models;

import javax.measure.Unit;
import javax.measure.format.UnitFormat;
import javax.measure.quantity.Quantity;

public class Product {
	
	private int id;
	private String name;
	private String stringUnit;
	
	//-------------------------------------------------------------------
	
	public Product() {}
	
	public Product(String name) {
		this.setName(name);
	}
	
	public Product(String name, String stringUnit) {
		this.setName(name);
		this.setStringUnit(stringUnit);
	}

	//-------------------------------------------------------------------
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = this.toCamelCase(name);
	}

	public String getStringUnit() {
		return stringUnit;
	}

	public void setStringUnit(String stringUnit) {
		this.stringUnit = stringUnit.toUpperCase();
	}

	public String toCamelCase(String inputString) {
		StringBuilder outputString = new StringBuilder();
		
		outputString.append(inputString.substring(0,1).toUpperCase());
		outputString.append(inputString.substring(1).toLowerCase());
				
		return outputString.toString();
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", stringUnit=" + stringUnit + "]";
	}

//	@Override
//	public Quantity<?> parseUnit(){
//		Quantity<Mass> weight = Quantities.getQuantity(1, Units.KILOGRAM);, so where is Quantity<Mass> weight = Quantities.getQuantity(1, Units.POUND);
//		return result;
//	}
	
}
