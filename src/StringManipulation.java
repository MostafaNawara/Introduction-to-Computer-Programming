
public class StringManipulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String word = "Hello Java";
		
		String anotherWord = ". From Eclipse";
		
		char letter = word.charAt(6);
		int wordLength = word.length();
		
		String fullWord = word + anotherWord;
		
		System.out.println(letter);
		System.out.println(wordLength);
		System.out.println(fullWord);
	}

}
