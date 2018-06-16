package main;

import java.awt.Graphics;

public abstract class Figur { //FRAGE: Kann es Instanzen von abstrakten Klassen geben?

	protected int x; //FRAGE: Werden private properties wirklich nicht vererbt?
	protected int y;
	
	public Figur(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void zeichne(Graphics g);
	
	public abstract double flaeche();
	
	public void move(int dx, int dy) { 
		x += dx;
		y += dy;
	}
	
}
