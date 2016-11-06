import java.util.Scanner;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the word");


		String word = input.nextLine();	
		String result = "";

		int wordLength = word.length();
		int i = 0;
		
		while (i < wordLength) {

			char value = word.charAt(wordLength-1);
			
			wordLength = wordLength -1;
			result = result + value;	
		}
		
		
		System.out.println(result);
	}

}