
public class MultiDimensionArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int [] x = {5, 10, 25, 125};
		
		System.out.println(x[2]);
		
		int [] [] y = {{3, 4, 5}, {9, 65, 75}, {98, 12}, {85, 52, 125}};
		
		System.out.println(y[3][0]);
		
		y[3][0] = 125;

		System.out.println(y[3][0]);

	}

}
