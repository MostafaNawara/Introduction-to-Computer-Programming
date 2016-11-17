import java.util.Scanner;


public class StudentDegrees {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of student");

		int studentLength = input.nextInt();
		
		// init Array For student & degrees for every student 
		int [] [] degrees = new int [studentLength][];
		int [] totals = new int[studentLength];
		
		// Get degrees for students
		for (int i = 0; i < studentLength; i++) {

			System.out.println("Enter the student number " + i + " subjects");

			int subjectLength = input.nextInt();
			degrees [i] = new int [subjectLength];

			System.out.println("Enter the student number " + i + " degrees");
			for (int j = 0; j < subjectLength; j++) {
				degrees [i] [j] = input.nextInt();
			}
		}
		
		// Calculate totals
		for (int i = 0; i < studentLength; i++) {
			int sum = 0;
			int subjectLength = degrees[i].length;

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
