import java.util.Scanner;


public class MatchStringCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two words");
		
		String First = input.nextLine();
		String Second = input.nextLine();
		
		int firstLength = First.length();
		int secondLength = Second.length()-firstLength+1;

		int matched = 0;
		

		for (int i = 0; i < secondLength ; i++) {
			for (int j = 0; j < firstLength; j++) {
				if (First.charAt(j) == Second.charAt(i+j)) {
					if (j == firstLength-1) {
						matched = matched + 1;						
					}
				}else {
					break;
				}
			}			
		}


		if (matched != 0) {
			System.out.println("Number of matching = " + matched);
		}else {
			System.out.println("Not found matched words");			
		}


	}

}
