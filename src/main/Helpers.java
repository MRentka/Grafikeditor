package main;

public class Helpers {
	
	public static void sortDoubleArDesc(double[] ar) {
		for(int i = 0; i < ar.length; i++) {
			for(int j = ar.length - 1; j > 0; j--) {
				if(ar[j] > ar[j-1]) {
					double tmp = ar[j-1];
					ar[j-1] = ar[j];
					ar[j] = tmp;
				}
			}
		}
	}
	
	public static double getMaximumFromDoubleAr(double[] ar) {
		sortDoubleArDesc(ar);
		return ar[0];
	}

	/*
	 * https://brilliant.org/wiki/distance-formula/
	 */
	public static double distance(int x, int y, int x2, int y2) {
		return Math.sqrt(Math.pow((x - x2), 2) + Math.pow((y - y2), 2));
	}
	
	public static int pointBetweenTwoPoints(int x, int y, int x2, int y2) {
		
		return 0;
	}
}
