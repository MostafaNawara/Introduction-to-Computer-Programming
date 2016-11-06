import java.util.Scanner;


public class DigitsNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the word contin numbers");


		String word = input.nextLine();	
		int result = 0;
		
		int wordLength = word.length();

		for (int i = 0; i < wordLength; i++) {

			char value = word.charAt(i);

			switch (value) {
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					result = result + 1;
					break;
				default:
					break;
			}
			
		}
	
		System.out.println(result);
	}

}
