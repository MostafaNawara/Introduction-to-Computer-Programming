import java.util.Scanner;


public class ArrayFromUser {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Array length");
		int arrayLength = input.nextInt();
		
		int [] x = new int[arrayLength];
		
		int sum = 0;
		
		for (int i = 0; i < arrayLength; i++) {
			System.out.println("Enter Element #" + i);
			
			// Add user input to array 
			x[i] = input.nextInt();
			
			sum = sum + x[i];
		}
		
		System.out.println("The total is: " + sum);
		
		
	}

}
