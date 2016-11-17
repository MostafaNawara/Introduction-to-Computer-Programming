import java.util.Scanner;


public class MultiDimensionArraysStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int studentLength = 5;
		int subjectLength = 3;
		
		// init Array For student & degrees for every student 
		int [] [] degrees = new int [studentLength][subjectLength];
		int [] totals = new int[studentLength];
		
		// Get degrees for students
		for (int i = 0; i < studentLength; i++) {
			System.out.println("Enter the student number " + i + " degrees");
			
			for (int j = 0; j < subjectLength; j++) {
				degrees [i] [j] = input.nextInt();
			}
		}
		
		// Calculate totals
		for (int i = 0; i < studentLength; i++) {
			int sum = 0;
			
			for (int j = 0; j < subjectLength; j++) {
				sum = sum + degrees[i][j];
			}
			// Add student degrees to the totals
			totals[i] = sum;
		}
		
		// Print totals
		for (int i = 0; i < studentLength; i++) {
			System.out.println("Total of degrees for student number #" + i + " is: " + totals[i]);
		}

		
	}

}
