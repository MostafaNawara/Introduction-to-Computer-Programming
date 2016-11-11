import java.util.Scanner;


public class ArrayMaxMin {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Array length");
		int arrayLength = input.nextInt();
		
		// init Array & Sum & Min & Max
		int [] x = new int[arrayLength];
		int sum = 0;
		int max = x[0];
		int min = x[0];

		// Loop to create array
		for (int i = 0; i < arrayLength; i++) {
			System.out.println("Enter Element #" + i);
			
			// Add user input to array 
			x[i] = input.nextInt();
			
			sum = sum + x[i];

			if (x[i] > max) {
				max = x[i];
			}
			if (x[i] < min) {
				min = x[i];
			}
		
		}


		// Print Sum & Max & Min
		System.out.println("The total is: " + sum);
		System.out.println("Max number is: " + max);
		System.out.println("Min number is: " + min);
		
		
	}

}
