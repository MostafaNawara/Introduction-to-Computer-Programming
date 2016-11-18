import java.util.Scanner;


public class RepeatedNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// 1st Array
		System.out.println("Enter the Array size: ");		
		int size = input.nextInt();
		input.nextLine();

		System.out.println("Enter the array " + size + " elements:");		
	
		// init the array
		int [] numbers = new int[size];

		// Create the array
		for (int i = 0; i < size; i++) {
			numbers[i] = input.nextInt();
		}
		

		// Check Repeated number
		for (int i = 0; i < size; i++) {
			int currentNumber = numbers[i];
			int currentLength = 1;
			int prevNumber = 0;
			
			if (i > 0){
				prevNumber = numbers[i];
			}
			
			for (int j = i+1; j < size; j++) {
				if (prevNumber == numbers[j]) {
					continue;
				}
				if (currentNumber == numbers[j]) {
					currentLength++;
				}
			}

			if (currentLength > 1) {
				System.out.println(currentNumber + " is repeated: " + currentLength + " times.");
			}
			
		}
	}

}
