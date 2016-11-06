import java.util.Scanner;


public class NumberReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number");


		int x = input.nextInt();
		int steps = 0;
		
		
		if (x <= 1) {
			System.out.println("\"Error\" Add number more than 1");
		}else {
			while ( x != 1) {
				if (x % 2 == 0) {

					x = x / 2;
					
					// Update the steps value
					steps = steps + 1;
					
					System.out.println(x);
				} else {

					x = (x * 3) + 1;
					
					// Update the steps value
					steps = steps + 1;
					
					System.out.println(x);
				}
			}
			
			System.out.println("Number of steps: " + steps);
		}

	}

}
