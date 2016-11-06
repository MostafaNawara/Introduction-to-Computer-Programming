import java.util.Scanner;


public class ChangeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the word contin numbers");


		String word = input.nextLine();	
		String result = "";
		
		int wordLength = word.length();
		String numWord = "";

		for (int i = 0; i < wordLength; i++) {

			char value = word.charAt(i);
				
			switch (value) {
			case '0':
				numWord = "zero";
				break;
			case '1':
				numWord = "one";
				break;
			case '2':
				numWord = "two";
				break;
			case '3':
				numWord = "three";
				break;
			case '4':
				numWord = "four";
				break;
			case '5':
				numWord = "five";
				break;
			case '6':
				numWord = "six";
				break;
			case '7':
				numWord = "seven";
				break;
			case '8':
				numWord = "eight";
				break;
			case '9':
				numWord = "nine";
				break;
			default:
				numWord = "";
				break;
			}
			
			// Add the value
			if (numWord != "") {
				result = result + numWord;
			}else {
				result = result + value;
			}
			
			
			
		}
		
		System.out.println(result);
	
	}

}
