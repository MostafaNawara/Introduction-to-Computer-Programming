import java.util.Scanner;


public class StartsLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of rows & cols");

		int rows = input.nextInt();
		int cols = input.nextInt();
		
		for (int i = 1; i <= rows; i++) {
			
			for (int j = 0; j < cols; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
	}

}
