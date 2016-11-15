import java.util.Scanner;


public class SortingArray {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Get array size
		System.out.println("Enter the Array size");
		int size = input.nextInt();
		
		// init Array
		int [] x = new int[size];

		
		// Loop to create array
		for (int i = 0; i < size; i++) {
			System.out.println("Enter Element #" + i);
			
			// Add user input to array 
			x[i] = input.nextInt();
		}
		
		// Sorting
		for (int i = 0; i < size; i++) {
			
			// Get minimal val 
			int min = x[i];
			int minIndex = i;
			for (int j = i; j < size; j++) {
				if (x[j] < min) {
					min = x[j];
					minIndex = j;
				}
			}
			
			// Swapping x[i], x[minIndex]
			int temp = x[i];
			x[i] = x[minIndex];
			x[minIndex] = temp;

			
		}
		
		// Print the array
		for (int i = 0; i < size; i++) {
			System.out.println(x[i]);	
		}		
		
	}

}
