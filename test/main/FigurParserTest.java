package main;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class FigurParserTest {
	
	private FigurDAOStub dao;
	
	public FigurParserTest() {
		this.dao = new FigurDAOStub();
	}

	@Test
	void test() {
		List<Figur> figuren = new ArrayList<Figur>();
	    String[] figurData = dao.readNextFigurData();
	    while (figurData != null) {
	      String figurTyp = figurData[0];
	      int x = Integer.valueOf(figurData[1]);
	      int y = Integer.valueOf(figurData[2]);
	      switch (figurTyp) {
	      case "Rechteck":
	        int breite = Integer.valueOf(figurData[3]);
	        int hoehe = Integer.valueOf(figurData[4]);
	        figuren.add(new Rechteck(x, y, breite, hoehe));
	        break;
	      case "Kreis":
	        int radius = Integer.valueOf(figurData[3]);
	        figuren.add(new Kreis(x, y, radius));
	        break;
	      case "Linie":
	        int endx = Integer.valueOf(figurData[3]);
	        int endy = Integer.valueOf(figurData[4]);
	        figuren.add(new Linie(x, y, endx, endy));
	        break;
	      }
	      figurData = dao.readNextFigurData();
	    }
	    //TODO: einzelne asserts als Funktionen
	    assertEquals(figuren.size(), 3);
	    for(Figur f : figuren) {
	    	System.out.println(f.toString());
	    	assertThat(f, instanceOf(Figur.class));
	    	assertEquals(0, f.x);
	    	assertEquals(10, f.y);
	    	//hier benutze ich Reflection -> Definition nachschauen
	    	//syso für mich
	    	if(f.getClass() == Rechteck.class) {
	    		System.out.println(((Rechteck) f).getBreite());
	    		assertEquals(10,((Rechteck) f).getBreite());
	    		System.out.println(((Rechteck) f).getHoehe());
	    		assertEquals(20,((Rechteck) f).getHoehe());
	    	}
	    	if(f.getClass() == Kreis.class) {
	    		System.out.println(((Kreis)f).getRadius());
	    		assertEquals(30, ((Kreis)f).getRadius());
	    	}
	    	if(f.getClass() == Linie.class) {
	    		System.out.println(((Linie)f).getEndX());
	    		assertEquals(80, ((Linie)f).getEndX());
	    		System.out.println(((Linie)f).getEndY());
	    		assertEquals(100, ((Linie)f).getEndY());
	    	}
	    }
	}

}
