package main;

import java.awt.Graphics;
import java.awt.Point;

final class EditorControl {
	private EditorFrame editorFrame;
	private Zeichnung zeichnung = new Zeichnung();
	private String figurTyp = "rechteck";
	private Point ersterPunkt;

	public EditorControl(EditorFrame editorFrame) {
		this.editorFrame = editorFrame;
	}

	public void allesNeuZeichnen(Graphics g) {
		zeichnung.zeichneFiguren(g);
	}

	public void setFigurTyp(String figurTyp) {
		this.figurTyp = figurTyp;
	}

	public void setErsterPunkt(Point ersterPunkt) {
		this.ersterPunkt = ersterPunkt;
	}

	/*
	 * TODO: Switch Struktur abl�sen.
	 */
	public void erzeugeFigurMitZweitemPunkt(Point zweiterPunkt) {
		
		
		switch(figurTyp) {
		case "rechteck":
			int breite = zweiterPunkt.x > ersterPunkt.x ? zweiterPunkt.x - ersterPunkt.x : ersterPunkt.x - zweiterPunkt.x;
			int hoehe = zweiterPunkt.y > ersterPunkt.y ? zweiterPunkt.y - ersterPunkt.y : ersterPunkt.y - zweiterPunkt.y;
			int x = zweiterPunkt.x > ersterPunkt.x ? ersterPunkt.x : zweiterPunkt.x;
			int y = zweiterPunkt.y > ersterPunkt.y ? ersterPunkt.y : zweiterPunkt.y;
			Figur f = new Rechteck(x, y, breite, hoehe);
			zeichnung.hinzufuegen(f);
			editorFrame.getContentPane().repaint();
			break;
		case "linie":
			int liniex = ersterPunkt.x;
			int liniey = ersterPunkt.y;
			int linieEndX = zweiterPunkt.x;
			int linieEndY = zweiterPunkt.y;
			Figur f2 = new Linie(liniex, liniey, linieEndX, linieEndY);
			zeichnung.hinzufuegen(f2);
			editorFrame.getContentPane().repaint();
			break;
		case "kreis":
			int kreisx = ersterPunkt.x;
			int kreisy = ersterPunkt.y;
			double radius = 2 * Helpers.distance(ersterPunkt.x, ersterPunkt.y, zweiterPunkt.x, zweiterPunkt.y);
			Figur f3 = new Kreis(kreisx, kreisy, (int)radius);
			zeichnung.hinzufuegen(f3);
			editorFrame.getContentPane().repaint();
			break;	
		}
		
	}
}
