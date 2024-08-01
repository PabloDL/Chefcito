package com.DLDev.Chefcito.models;

import java.util.Objects;

import javax.measure.MeasurementException;
import javax.measure.format.UnitFormat;

import javax.measure.Quantity;
import javax.measure.quantity.Mass;
import javax.measure.quantity.Volume;
import javax.measure.spi.SystemOfUnits;
import javax.measure.spi.SystemOfUnitsService;
import javax.measure.unit.BaseUnit;


public class Ingredient extends Product{
	
	private int id;
	private double amount;
		
	public Ingredient() {
		super();
	}
	
	public Ingredient(String name, String unit, double amount) {
		super(name, unit);
		this.amount = amount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, super.getName(), super.getStringUnit());
	}
	
}
