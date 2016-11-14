import java.util.Scanner;


public class ReverseArrayWithSwapping {

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
		
		System.out.println("Enter Array content: ");
		
		// creat the array
		for (int i = 0; i < size; i++) {
			String str = input.nextLine();
			x[i] = str.charAt(0);
		}
		

		for (int i = 0 , j = size-1; i < size/2; i++, j--) {
			// swap x[i], x[j]
			char temp = x[i];
			x[i] = x[j];
			x[j] = temp;
		}
		
		// Print
		for (int i = 0; i < size; i++) {
			System.out.println(x[i]);
		}
	
	}

}
