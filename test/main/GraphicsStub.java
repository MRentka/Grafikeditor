package main;

public class GraphicsStub extends ConcreteGraphics {

	int countDrawOvalCalls;
	int x;
	int y;
	int radiusBreite;
	int radiusHoehe;
	
	@Override
	public void drawOval(int x, int y, int breite, int hoehe) {
		countDrawOvalCalls++;
		this.x = x;
		this.y = y;
		this.radiusBreite = breite;
		this.radiusHoehe = hoehe;
	}

	
}
