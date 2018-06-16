package main;

import java.awt.Point;

public abstract class FigurFactory {

	public abstract Figur createFigur(Point ersterPunkt, Point zweiterPunkt);
}
