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
		int secondLength = Second.length();
		
		int matched = 0;
		
		// System.out.println(fristLength);

		for (int i = 0; i < secondLength ; i++) {
			char x = First.charAt(i);
			char y = Second.charAt(i);
		}
		
		if (matched != 0) {
			System.out.println("Number of matching = " + matched);
		}else {
			System.out.println("Not found matched words");			
		}

/*
 *
 * 	6) Write a program that returns number of occurrences of a string in another string.
 *	E.g.
 *	Input:
 *	First String: the
 *	Second String: the students are working hard in the faculty of Engineering because they
 *	love it
 *	Output:
 *	3
 *	Note: You should use nested loops. Don’t use some methods like indexOf or substring
 *
 */

	}

}
