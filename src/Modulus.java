import java.util.Scanner;

public class Modulus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScanner = new Scanner(System.in);
		
		int pocket = inputScanner.nextInt();
		int price = inputScanner.nextInt();
		
		int itemsNumber = pocket / price;
		int saveValue = pocket % price;
			
		System.out.println("You can buy " + itemsNumber + " Item");

		System.out.println("You can save " + saveValue + " LE");


	}

}
