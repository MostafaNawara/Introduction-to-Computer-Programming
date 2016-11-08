import java.util.Scanner;


public class StarsShap4 {

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
		
	}

}
