import java.util.Scanner;


public class Attendance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of the day: from 1 to 7");
		
		int day = input.nextInt();
		
		switch (day) {
		case 1:
			System.out.println("The work from 7 to 3");
			break;
		case 2:
			System.out.println("The work from 7 to 5");
			break;
		case 3:
			System.out.println("The work from 7 to 3");
			break;
		case 4:
			System.out.println("The work from 7 to 3");
			break;
		case 5:
			System.out.println("The work from 7 to 5");
			break;
		case 6:
			System.out.println("The work from 7 to 2");
			break;
		case 7:
			System.out.println("No work to day");
			break;
		default:
			System.out.println("Error Day number not found. Enter number bettwen 1 and 7");
			break;
		}

	}

}
