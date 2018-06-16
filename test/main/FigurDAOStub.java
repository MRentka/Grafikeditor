package main;

public class FigurDAOStub implements FigurDAO {

	private String[] testFiguren = {
			"Rechteck,0,10,10,20",
			"Kreis,0,10,30",
			"Linie,0,10,80,100"
	};
	
	private int counter = 0;
	
	/*
	 * Möglichst wenig Anpassungen,
	 * damit urspr. Form gewahrt wird.
	 * (non-Javadoc)
	 * @see main.FigurDAO#readNextFigurData()
	 */
	@Override
	public String[] readNextFigurData() {
		if (testFiguren != null && counter < testFiguren.length) {
		      try {
		        String line = testFiguren[counter];
		        if (line != null && !line.isEmpty()) 
		        	counter++;
		        	return line.split(",");
		      } catch (Exception e) {
		        e.printStackTrace();
		      }
		    }
		    return null;
	}

}
