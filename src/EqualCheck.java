import java.util.Scanner;


public class EqualCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two words");
		
		String fristWord = input.nextLine();
		String scondWord = input.nextLine();
		
		int fristLength = fristWord.length();
		int scondLength = scondWord.length();
		
		// System.out.println(fristLength);
		// System.out.println(scondLength);

		if (fristLength == scondLength) {
			boolean eq = false;

			for (int i = 0; i < fristLength ; i++) {
				char x = fristWord.charAt(i);
				char y = scondWord.charAt(i);
				
				if (x == y) {
					eq = true;
				}else {
					eq = false;
				}
			}
			
			if (eq) {
				System.out.println("Equal");
			}else {
				System.out.println("Not Equal");					
			}
		}else {
			System.out.println("Not Equal");
		}
		
	}

}
