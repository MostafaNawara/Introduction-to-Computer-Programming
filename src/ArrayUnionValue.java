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
		
		
		// All items one array
		int AllElementsArraySize = firstArraySize + secondArraySize;
		int [] AllElementsArray = new int [AllElementsArraySize];
		
		for (int i = 0; i < firstArraySize; i++) {
			AllElementsArray[i] = firstArray[i];
		}
		for (int i = 0; i < secondArraySize; i++) {
			AllElementsArray[i+firstArraySize] = secondArray[i];
		}
		

		
		// Get IntersectionArraySize 
		int IntersectionArraySize = 0;
		for (int i = 0; i < AllElementsArraySize; i++) {
			for (int j = i+1; j < AllElementsArraySize; j++) {
				if (AllElementsArray[i] == AllElementsArray[j]){
					IntersectionArraySize++;
				}
			}
		}

		
		// int UnionArray & IntersectionArray
		int [] UnionArray = new int[AllElementsArraySize - IntersectionArraySize];
		int UnionArrayCurrent= 0;
		int [] IntersectionArray = new int[IntersectionArraySize];
		int IntersectionArrayCurrent= 0;

/*		// Get UnionArray
		for (int i = 0; i < AllElementsArraySize; i++) {
			
			for (int j = i+1; j < AllElementsArraySize; j++) {
				if (AllElementsArray[i] != AllElementsArray[j]){
					UnionArray[i] = AllElementsArray[i];
					UnionArrayCurrent++;
					break;
				}
			}
			
		}*/

		// Get IntersectionArray
		for (int i = 0; i < AllElementsArraySize; i++) {
			for (int j = i+1; j < AllElementsArraySize; j++) {
				if (AllElementsArray[i] == AllElementsArray[j]){
					IntersectionArray[IntersectionArrayCurrent] = AllElementsArray[i];
					IntersectionArrayCurrent++;
				}
			}
			System.out.println(AllElementsArray[i]);
		}
		
/*		// Print UnionArray
		System.out.println("Union (Array1, Array2):");
		for (int i = 0; i < UnionArray.length; i++) {
			System.out.print(UnionArray[i]);

			if (i != UnionArray.length-1) {
				System.out.print(", ");
			}
		}*/

		// Print IntersectionArray
		System.out.println(" ");
		System.out.println("Intersection (Array1, Array2):");
		for (int i = 0; i < IntersectionArraySize; i++) {
			System.out.print(IntersectionArray[i]);

			if (i != IntersectionArraySize-1) {
				System.out.print(", ");
			}
		}

	}
}



