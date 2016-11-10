
public class ArraySum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int [] x = {3, 20, 52, 85, 41, 98, 54, 96, 22, 248};

		int sum = 0;
		
		for (int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		
		System.out.println(sum);
	}

}
