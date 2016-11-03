import java.util.Scanner;

public class Area {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Welcome To Get Area Calculator");

		System.out.println("Enter the height:");
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();

		System.out.println("Enter the width:");

		int y = input.nextInt();
		
		int totalArea = x * y;
		
		System.out.println(totalArea);
	}

}
