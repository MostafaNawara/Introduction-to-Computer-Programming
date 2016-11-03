import java.util.Scanner;


public class Average {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int y = input.nextInt();
		int z = input.nextInt();
		
		// GET total of the three numbers
		int numbersTotal = x + y + z;
		
		// GET the Avrage
		int numbersAvrage = numbersTotal / 3;
		
		
		System.out.println(numbersAvrage);

	}

}
