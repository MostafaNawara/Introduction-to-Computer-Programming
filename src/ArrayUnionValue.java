import java.util.Scanner;


public class ArrayUnionValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// 1st Array
		System.out.println("Enter First Array size: ");		
		int firstArraySize = input.nextInt();
		input.nextLine();

		System.out.println("Enter first array " + firstArraySize + " elements:");		
	
		// init the array
		int [] firstArray = new int[firstArraySize];

		// Create the array
		for (int i = 0; i < firstArraySize; i++) {
			firstArray[i] = input.nextInt();
		}

	
		// 2nd Array
		System.out.println("Enter Second Array size: ");		
		int secondArraySize = input.nextInt();
		input.nextLine();

		System.out.println("Enter Second array " + secondArraySize + " elements:");		

		// init the array
		int [] secondArray = new int[secondArraySize];

		// Create the array
		for (int i = 0; i < secondArraySize; i++) {
			secondArray[i] = input.nextInt();
		}
		
		
		// Get the output

		// init the array
		int [] UnionArray = new int [firstArraySize + secondArraySize];
		int [] IntersectionArray = new int [firstArraySize + secondArraySize];
		
		int UnionArraySize = 0;
		int IntersectionArraySize = 0;
		
		
		for (int i = 0; i < firstArraySize; i++) {
			for (int j = 0; j < secondArraySize; j++) {
				
				if (firstArray[i] == secondArray[j]){
					IntersectionArray[IntersectionArraySize] = firstArray[i];
					IntersectionArraySize++;
				}else {
					UnionArray[UnionArraySize] = firstArray[i];
					UnionArraySize++;					
				}
				
			}
		}

		// Print the result
		System.out.println("Union (Array1, Array2):");
		for (int i = 0; i < UnionArray.length; i++) {
			System.out.print(UnionArray[i] + ",");
		}
		
		System.out.println("");
		System.out.println("Intersection (Array1, Array2):");
		for (int i = 0; i < IntersectionArray.length; i++) {
			System.out.print(IntersectionArray[i] + ",");
		}
	}
}



