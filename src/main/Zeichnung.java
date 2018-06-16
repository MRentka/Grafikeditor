package main;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Zeichnung {

	private List<Figur> figuren = new ArrayList<Figur>();
	
	public Zeichnung() {
		// TODO Auto-generated constructor stub
	}

	public void hinzufuegen(Figur f) {
		figuren.add(f);
		
	}

	public void zeichneFiguren(Graphics g) {
		for (Figur f : figuren) {
			f.zeichne(g);
		}		
	}

}
