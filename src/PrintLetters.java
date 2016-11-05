import java.util.Scanner;


public class PrintLetters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the word");
		
		String word = input.nextLine();
		
		int wordLength = word.length();
		
		System.out.println(wordLength);
		System.out.println("==========================");

		for (int i = 0; i < wordLength; i++) {

			char value = word.charAt(i);
			System.out.println(i + "-" + value);			
		}
		System.out.println("==========================");
	}

}
