package entities;

import entities.enun.Color;

public abstract class Shape {
	
    private Color color;
    
    public Shape() {
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
    
	// usando o metodo abstract eu sou obrigado a mudar minha clase para abstract 
    public abstract double area();

}
