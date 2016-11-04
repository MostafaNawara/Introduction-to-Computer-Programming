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
		double r1 = input.nextInt();
		double r2 = input.nextInt();
		
		double fix = 1;

		// Get the equivalent resistance
		double resistanceSeries = r1 + r2;
		double resistanceParallel = (fix/r1) + (fix/r2);
		
		
	
		
		// Print the result 
		System.out.println("The Resistance Series: " + resistanceSeries);
		System.out.println("The Resistance Parallel: " + resistanceParallel);
		

	}

}
