package main;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

/*
 * Nachschauen: 
 * Was ist static import
 */
class KreisTest {

	private GraphicsStub g = new GraphicsStub();
	
	/*
	 * Draw Oval Erklärung, nötig für fix
	 * http://chortle.ccsu.edu/java5/notes/chap36/ch36_5.html
	 */
	@Test
	void testZeichne() {
		Kreis k = new Kreis(10, 20, 30); //eigtl hoehe breite beide = radius
		k.zeichne(g);
		assertEquals(1, g.countDrawOvalCalls);
		assertEquals(10 - 30/2, g.x);
		assertEquals(20 - 30/2, g.y);
		assertEquals(30, g.radiusBreite);
		assertEquals(30, g.radiusHoehe);
		Kreis k2 = new Kreis(40, 50, 60);
		k2.zeichne(g);
		assertEquals(2, g.countDrawOvalCalls);
		assertEquals(40 - 60/2, g.x);
		assertEquals(50 - 60/2, g.y);
		assertEquals(60, g.radiusBreite);
		assertEquals(60, g.radiusHoehe);
	}

}
