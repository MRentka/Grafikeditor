package main;

import java.awt.Graphics;

public class Linie extends Figur {

	private int endX;
	private int endY;
	
	public Linie(int x, int y, int endX, int endY) {
		super(x, y);
		this.endX = endX;
		this.endY = endY;
	}

	@Override
	public double flaeche() {
		return 0;
	}
	
	@Override
	public void zeichne(Graphics g) {
		g.drawLine(x, y, endX, endY);
		
	}
	
	public void move(int dx, int dy) { 
		x 	 += dx;
		endX += dx;
		y 	 += dy;
		endY += dy;
	}

}
