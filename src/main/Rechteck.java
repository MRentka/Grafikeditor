package main;

import java.awt.Graphics;

public class Rechteck extends Figur {

	private int hoehe;
	private int breite;
	
	public Rechteck(int x, int y, int breite, int hoehe) {
		super(x, y);
		this.hoehe = hoehe;
		this.breite = breite;
	}

	@Override
	public double flaeche() {
		return hoehe * breite;
	}
	
	@Override
	public void zeichne(Graphics g) {
		g.drawRect(x, y, breite, hoehe);		
	}

	public int getHoehe() {
		return hoehe;
	}

	public int getBreite() {
		return breite;
	}
	
}
