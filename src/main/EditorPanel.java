package main;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

@SuppressWarnings("serial")
final class EditorPanel extends JPanel {
	private EditorControl editorControl;

	EditorPanel(EditorControl control) {
		editorControl = control;
		addMouseListener(new EditorMouseHandler(editorControl));
		setKeyBindings();
	}

	// Die paintComponent()-Methode wird automatisch aufgerufen, wenn irgendwer die repaint()-
	// Methode beim EditorFrame oder beim EditorPanel aufruft.
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);	
		editorControl.allesNeuZeichnen(g);
	}

	/*
	 * @ME: Ich glaube ich hätte den key-listener einfach auf dem Frame machen können...
	 * https://stackoverflow.com/questions/8482268/java-keylistener-not-called
	 * https://docs.oracle.com/javase/tutorial/uiswing/misc/keybinding.html
	 * https://stackoverflow.com/questions/22741215/how-to-use-key-bindings-instead-of-key-listeners
	 */
	private void setKeyBindings() {
		ActionMap actionMap = getActionMap();
		int condition = JComponent.WHEN_IN_FOCUSED_WINDOW; //parent component sollte Fokus haben...
		InputMap inputMap = getInputMap(condition);

		String keyR = "rechteck";
		String keyL = "linie";
		String keyK = "kreis";
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R, 0), keyR);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_L, 0), keyL);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_K, 0), keyK);

		actionMap.put(keyR, new KeyAction(keyR));
		actionMap.put(keyL, new KeyAction(keyL));
		actionMap.put(keyK, new KeyAction(keyK));
	}

	private class KeyAction extends AbstractAction {
		public KeyAction(String actionCommand) {
			putValue(ACTION_COMMAND_KEY, actionCommand);
		}

		@Override
		public void actionPerformed(ActionEvent actionEvt) {
			editorControl.setFigurTyp(actionEvt.getActionCommand());
		}
	}

}

