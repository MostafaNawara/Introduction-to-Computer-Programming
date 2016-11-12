import java.util.Scanner;


public class ArrayMinMaxStudint {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the Array length");
		int size = input.nextInt();
		
		// init Arrays
		int [] x = new int[size];
		String [] names = new String[size];

		// init Min & Max
		int max = x[0];
		int min = x[0];
		
		// init maxStudent & minStudent
		String maxStudent = names[0];
		String minStudent = names[0];

		// Loop to create arrays
		for (int i = 0; i < size; i++) {

			System.out.println("Enter student Name #" + i);
			input.nextLine(); //Fix java bug 
			names[i] = input.nextLine();

			System.out.println("Enter student Degree #" + i);		
			x[i] = input.nextInt();

		}
		
		// Loob to get max & min
		for (int i = 0; i < size; i++) {
			if (x[i] > max) {
				max = x[i];
				maxStudent = names[i];
				
			}else if (x[i] < min) {
				min = x[i];
				minStudent = names[i];
			}
		}


		// Print Max & Min
		System.out.println("Max number is: " + max);
		System.out.println("Min number is: " + min);
		System.out.println("Max Student is: " + maxStudent);
		System.out.println("Min Student is: " + minStudent);

	}

}
