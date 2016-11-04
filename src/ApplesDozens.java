import java.util.Scanner;


public class ApplesDozens {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number of appels");
		
		Scanner inputScanner = new Scanner(System.in);
		
		int dozens = 12;
		
		int appelsNum = inputScanner.nextInt();

		// Get the dozens number 
		int dozensNum = appelsNum / dozens;

		// Get the over number 
		int overNum = appelsNum % dozens;
		
		
		// Print the number of the dozens
		System.out.println("The dozens number is " + dozensNum);
		
		// Print the number of over apples
		System.out.println("The over number is " + overNum);		
	}

}
