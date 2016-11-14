
public class SwappingVariables {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		
		// save the x value
		int temp = x;
		
		x = y;
		y = temp;
		
		System.out.println(x);
		System.out.println(y);

	}

}
