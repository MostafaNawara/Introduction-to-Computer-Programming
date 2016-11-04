import java.util.Scanner;


public class EvenOrOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inpScanner = new Scanner(System.in);

		System.out.println("Enter The Mark:");
		
		int x = inpScanner.nextInt();
		
		if (x % 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd Number");
		}
	}

}
