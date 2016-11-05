import java.util.Scanner;


public class LeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the year then press Enter:");
		
		int year = input.nextInt();
		
		if (year % 4 == 0) {
			System.out.println("Leap year: " + year);
		} else {
			System.out.println(year + " nota leap year!");
		}

	}


}
