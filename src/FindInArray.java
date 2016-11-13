import java.util.Scanner;


public class FindInArray {

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

		// Create the array
		for (int i = 0; i < size; i++) {
			inputArray[i] = input.nextInt();
		}
		
		System.out.println("Entrer the key");
		
		int key = input.nextInt();
		boolean found = false;
		
		
		// Print value
		for (int i = 0; i < size; i++) {
			if (inputArray[i] == key){
				found = true;
				break;
			}
		}
		
		if (found) {
			System.out.println("Found");			
		}else {
			System.out.println("Not found value");	
		}


	}
}



