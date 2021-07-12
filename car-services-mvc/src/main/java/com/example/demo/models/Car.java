package com.example.demo.models;

import org.springframework.stereotype.Component;

@Component
public class Car implements Comparable<Car> {

	private int dist;
	private String brand;
	private String model;
	private int year;
	
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Car(int dist, String model, String brand,int year) {
		super();
		this.dist = dist;
		this.brand = brand;
		this.model = model;
		this.year = year;
	}
	public int getDist() {
		return dist;
	}
	public void setDist(int dist) {
		this.dist = dist;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [dist=" + dist + ", model=" + model + ", brand=" + brand + ", year=" + year +"]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + dist;
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (dist != other.dist)
			return false;
		return true;
	}
	@Override
	public int compareTo(Car obj) {
		return this.brand.compareTo(obj.brand);
		
		
	}
	
	
}
