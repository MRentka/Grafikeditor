package main;

import java.awt.Graphics;

public class Kreis extends Figur {

	private int radius;

	public Kreis(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	@Override
	public double flaeche() {
		return Math.pow(radius, 2) * Math.PI;
	}
	
	public int getRadius() {
		return radius;
	}

	@Override
	public void zeichne(Graphics g) {
		g.drawOval(x - radius/2, y - radius/2, radius, radius);		
	}

}
