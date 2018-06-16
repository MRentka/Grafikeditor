package main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EditorMouseHandler extends MouseAdapter {

	private EditorControl editorControl;
	
	public EditorMouseHandler(EditorControl editorControl) {
		this.editorControl = editorControl;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		editorControl.setErsterPunkt(e.getPoint());
		System.out.println(e.getPoint()); //zur Kontrolle
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		editorControl.erzeugeFigurMitZweitemPunkt(e.getPoint());
		System.out.println(e.getPoint()); //zur Kontrolle
	}
}
