import java.util.Scanner;


public class ForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the \"start & end\" of the loop");
		
		int startLoop = input.nextInt();
		int endLoop = input.nextInt();
		
		// For loop
		for (int i = startLoop; i <= endLoop; i++) {
			System.out.println(i);
		}
	}

}
