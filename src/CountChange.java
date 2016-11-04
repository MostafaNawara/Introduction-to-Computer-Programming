import java.util.Scanner;


public class CountChange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// Get the values [quarters]
		System.out.println("Enter the number of quarters");
		int quartersNum = input.nextInt();
		
		// Get the values [dimes]
		System.out.println("Enter the number of dimes");		
		int dimesNum = input.nextInt();
		
		// Get the values [nickel]
		System.out.println("Enter the number of nickel");		
		int nickelNum = input.nextInt();

		// Get the values [cents]
		System.out.println("Enter the number of cents");		
		int centsNum = input.nextInt();
		
		// Convert numbers to cents
		int quartersInCents = quartersNum * 25;
		int dimesInCents = dimesNum * 10;
		int nickelInCents = nickelNum * 5;
		int centsInCents = centsNum * 1;


		// Get the total cents
		float totalCents = quartersInCents + dimesInCents + nickelInCents + centsInCents;

		// Get the total dollars & print it 
		float total = totalCents / 100;
		System.out.print("The total : " + total + "$");		

	}

}
