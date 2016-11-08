/**
 * 
 */

/**
 * @author Mostafa Nawara
 *
 */
public class LoopBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
		
			if (i == 3) {
				break;
			}

			System.out.println(i);
			
		}
		
		System.out.println("The loop end here :D");
		System.out.println("======================================");
		
		for (int i = 0; i < 7; i++) {


			if (i == 5) {
				continue;
			}
			
			System.out.println(i);
		}

		System.out.println("We rmover 5 :P");
		
		
	}

}
