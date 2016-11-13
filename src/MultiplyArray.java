import java.util.Scanner;


public class MultiplyArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Array size: ");		
		int size = input.nextInt();
		input.nextLine();

		System.out.println("Enter the " + size + " array elements:");		
		
		// init the array
		int [] inputArray = new int[size];
		int [] outputArray = new int[size];

		// Create the array
		for (int i = 0; i < size; i++) {
			inputArray[i] = input.nextInt();
			
			outputArray[i] = inputArray[i]*2;
		}
		
		// Print value
		for (int i = 0; i < size; i++) {
			System.out.println(outputArray[i]);
		}


	}
}
