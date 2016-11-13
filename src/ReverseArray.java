import java.util.Scanner;


public class ReverseArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Array size: ");		
		int size = input.nextInt();
		input.nextLine();
		
		// init the array
		char [] x = new char[size];
		char [] y = new char[size];
		
		System.out.println("Enter Array content: ");
		
		// creat the array
		for (int i = 0; i < size; i++) {
			String str = input.nextLine();
			x[i] = str.charAt(0);
		}
		

		for (int i = size-1 , j = 0; i >= 0; i--, j++) {
			y[j] = x[i];
		}
		
		// Print
		for (int i = 0; i < size; i++) {
			System.out.println(y[i]);
		}
	
	}

}
