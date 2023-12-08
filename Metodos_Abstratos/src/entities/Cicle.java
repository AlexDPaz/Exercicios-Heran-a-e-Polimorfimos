package entities;

import entities.enun.Color;

public class Cicle extends Shape {
	
	private Double radius;
	
	public Cicle() {
		super();
	}

	public Cicle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	
	

}