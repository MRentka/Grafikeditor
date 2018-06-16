package main;

import java.awt.Graphics;

public class Oval extends Figur {

	private int breite;
	private int hoehe;
	
	public Oval(int x, int y, int breite, int hoehe) {
		super(x, y);
		this.hoehe = hoehe;
		this.breite = breite;
	}

	@Override
	public void zeichne(Graphics g) {
		g.drawOval(x, y, breite, hoehe);		
	}

	@Override
	public double flaeche() {
		return breite * hoehe * Math.PI;
	}

}
