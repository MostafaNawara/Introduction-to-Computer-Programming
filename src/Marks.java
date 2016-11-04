import java.util.Scanner;


public class Marks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		Scanner inpScanner = new Scanner(System.in);

		System.out.println("Enter The Mark:");
		
		int x = inpScanner.nextInt();
		
		if (x >= 50) {
			System.out.println("Success");
			System.out.println();
		} else {
			System.out.println("Fail");
		}
	}

}
