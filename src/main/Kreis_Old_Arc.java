package main;

import java.awt.Graphics;

public class Kreis_Old_Arc extends Figur {

	private int radius;

	public Kreis_Old_Arc(int x, int y, int radius) {
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
		g.drawArc(x, y, radius, radius, 0, 360);		
	}

}
