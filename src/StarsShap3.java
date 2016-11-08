import java.util.Scanner;


public class StarsShap3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);		

		System.out.println("Enter Number");
		
		int num = input.nextInt();

		for (int i = 1; i <= num; i++) {
			
			int spaceLoop = num  - i;

			for (int j = 1; j <= spaceLoop ; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i ; k++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
		// second part
		for (int i = 1; i <= num; i++) {
			
			int spaceLoop = num  - i;

			for (int j = 1; j <= i ; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= spaceLoop ; k++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}

		
		
	}

}
