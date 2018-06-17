package main;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.*;
import org.mockito.junit.jupiter.MockitoExtension;

/*
 * https://stackoverflow.com/questions/40961057/how-to-use-mockito-with-junit5
 * https://blog.codefx.org/design/architecture/junit-5-extension-model/#JUnit-5-Extension-Model
 * https://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.mockito%22%20AND%20a%3A%22mockito-junit-jupiter%22
 */
@ExtendWith(MockitoExtension.class)
class ZeichnungTest {

	@Mock
	static Graphics g;
	
	static List<Figur> figuren = new ArrayList<Figur>();
	@Test
	static void testZeichneFiguren() {
		
		figuren.add(new Rechteck(10,20,30,40));
		figuren.add(new Linie(10,20, 100, 200));
		figuren.add(new Kreis(50,60,120));
		for (Figur f : figuren) {
			f.zeichne(g);
		}
		verify(g, times(1)).drawRect(10, 20, 30, 40);
		verify(g, times(1)).drawLine(10, 20, 100, 200);
		verify(g, times(1)).drawOval(50-60, 60-60, 120, 120);
	}

}
