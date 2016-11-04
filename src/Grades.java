import java.util.Scanner;


public class Grades {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Grades: ");
		
		int x = input.nextInt();
		
		if (x >= 85) {
			System.out.println("The degree is \"Excellent\"");
		} else if (x >= 75) {
			System.out.println("The degree is \"Very Good\"");
		}else if (x >= 60) {
			System.out.println("The degree is \"Good\"");
		}else if (x >= 50) {
			System.out.println("The degree is \"Passed\"");
		}else {
			System.out.println("The degree is \"Fail\"");
		}

	}

}
