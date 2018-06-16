package main;

import java.awt.Graphics;

/*
 * KOMPETENZ 1.4: Neue Figur einfügen
 */
public class Dreieck extends Figur {
	
	private int x2, x3, y2, y3;

	public Dreieck(int x, int x2, int x3, int y, int y2, int y3) {
		super(x, y);
		this.x2 = x2;
		this.x3 = x3;
		this.y2 = y2;
		this.y3 = y3;
	}

	@Override
	public void zeichne(Graphics g) {
		int[] xn = {x, x2, x3};
		int[] yn = {y, y2, y3};
		g.drawPolygon(xn, yn, 3);
	}

	/*
	 * Herons Formula
	 * https://www.wikihow.com/Find-the-Height-of-a-Triangle
	 * List of primitives
	 * https://stackoverflow.com/questions/18021218/create-a-list-of-primitive-int
	 * Geht iwie nicht mit List... wie geht das?
	 */
	@Override
	public double flaeche() {
		double[] distances = {Helpers.distance(x, y, x2, y2), 
							  Helpers.distance(x2, y2, x3, y3), 
							  Helpers.distance(x, y, x3, y3)};
		double s = (distances[0] + distances[1] + distances[2]);		
		return Math.sqrt(s * (s - distances[0]) * (s - distances[1]) * (s - distances[2]));
	}
	
}
