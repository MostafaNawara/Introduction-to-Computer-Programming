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
		System.out.println("Enter First Array size: ");		
		int secondArraySize = input.nextInt();
		input.nextLine();

		System.out.println("Enter first array " + secondArraySize + " elements:");		

		// init the array
		int [] secondArray = new int[secondArraySize];

		// Create the array
		for (int i = 0; i < secondArraySize; i++) {
			secondArray[i] = input.nextInt();
		}
		
		
		// Get the output

		// init the array
		int [] UnionArray = {};
		int [] IntersectionArray = {};

		for (int i = 0; i < firstArraySize; i++) {
			for (int j = 0; j < secondArraySize; j++) {
				
			}
		}

/*
		Write Java program that given two arrays of integers, prints the union array and the intersection array.
		Assume that the input arrays do not consist of duplicates.
		For example
		Array1: 12, 32, 14, 35, 89, 16, 120
		Array2: 9, 12, 8, 17, 120, 35, 36
		Union (Array1, Array2): 12, 32, 14, 35, 89, 16, 120, 9, 8, 17, 36
		Intersection (Array1, Array2): 12, 35, 120
		Input:
		Enter first array size: 7
		Enter first array elements:
		12
		32
		14
		35
		89
		16
		120
		Enter second array size: 7
		Enter second array elements:
		9
		12
		8
		17
		120
		35
		36
		Page 5
		Output:
		Union:
		12
		32
		14
		35
		89
		16
		120
		9
		8
		17
		36
		Intersection:
		12
		35
		120
		Note: You should use loops here.
		
*/
		
			

	}
}



