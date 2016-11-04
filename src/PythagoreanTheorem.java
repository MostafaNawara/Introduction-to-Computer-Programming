import java.util.Scanner;


public class PythagoreanTheorem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// Get the 'M' values
		System.out.println("Enter The 'M' value");
		int m = input.nextInt();
		
		// Get the 'N' values
		System.out.println("Enter The 'N' value");		
		int n = input.nextInt();

		
		// Get 'A' Value
		Double a = Math.pow(m, 2) - Math.pow(n, 2);

		// Get 'B' Value
		int b = 2 * m * n;
		
		// Get 'C' Value
		Double c = Math.sqrt((Math.pow(m, 2) + Math.pow(n, 2)));
				
		
		// Print the 'A' value
		System.out.println("The 'A' value: " + a);

		// Print the 'B' value
		System.out.println("The 'B' value: " + b);

		// Print the 'C' value
		System.out.println("The 'C' value: " + c);
	}

}
