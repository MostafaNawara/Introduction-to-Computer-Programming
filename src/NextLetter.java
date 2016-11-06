import java.util.Scanner;

public class NextLetter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the word");


		String word = input.nextLine();	
		String result = "";
		
		int wordLength = word.length();

		for (int i = 0; i < wordLength; i++) {

			char value = word.charAt(i);
			
			if (value == 'z') {
				value = 'a';
			} else {
				value = (char) (value+1);
			}
			
			// All values
			result = result + value;
		}
		
		System.out.println(result);
	}

}