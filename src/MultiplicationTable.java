
/**
 * @author Mostafa Nawara
 *
 */
public class MultiplicationTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Add Table header
		
		System.out.print("   || ");
		
		for (int i = 1; i <= 10; i++) {

			if (i < 10) {
				System.out.print(" ");
			}

			System.out.print(i + " | ");
		}
		
		System.out.println("");
		System.out.println("=======================================================");
		
		for (int x = 1; x <= 10; x++) {

			if (x < 10) {
				System.out.print(" ");
			}

			System.out.print(x + " || ");
			
			for (int y = 1; y <= 10; y++) {
				int val = x * y;
				
				if (val < 10) {
					System.out.print(" ");
				}
				
				System.out.print(val + " | ");
			}
			System.out.println("");
			System.out.println("-------------------------------------------------------");

		}
	}

}
