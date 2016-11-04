import java.util.Scanner;


public class Resistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter two 'Resistance' Numbers");
		
		Scanner input = new Scanner(System.in);
		
		// Get 'R1' & 'R2' values
		int r1 = input.nextInt();
		int r2 = input.nextInt();

		// Get the equivalent resistance
		float resistanceSeries = r1 + r2;
		float resistanceParallel = (1/r1) + (1/r2);
		
		
		// Print the result 
		System.out.println("The Resistance Series: " + resistanceSeries);
		System.out.println("The Resistance Parallel: " + resistanceParallel);
		

	}

}
