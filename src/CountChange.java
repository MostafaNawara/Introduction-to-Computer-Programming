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
		
		// Convert numbers to dollars
		float quartersInDollars = quartersNum / 4;
		float dimesInDollars = dimesNum / 10;
		float nickelInDollars = nickelNum / 20;
		float centsInDollars = centsNum / 100;


		// Get the total dollars & print it 
		float total = quartersInDollars + dimesInDollars + nickelInDollars + centsInDollars;
		System.out.print("The total : " + total + "$");		

	}

}
