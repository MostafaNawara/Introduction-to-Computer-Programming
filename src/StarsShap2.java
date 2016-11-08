import java.util.Scanner;


public class StarsShap2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);		

		System.out.println("Enter Number");
		
		int num = input.nextInt();

		for (int i = 1; i <= num; i++) {
			
			int innerLoop = (num + 1) - i;

			for (int j = 1; j <= innerLoop ; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

}
