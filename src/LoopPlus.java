import java.util.Scanner;


public class LoopPlus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the \"start & end\" of the loop");
		
		int startLoop = input.nextInt();
		int endLoop = input.nextInt();
		
		int i = startLoop;
		int sum = 0;
		int oddSum = 0;
		int evenSum = 0;
		
		while (i <= endLoop) {
			sum = sum + i;
			
			if (i % 2 == 0) {
				evenSum = evenSum + i;
			}else {
				oddSum = oddSum + i;
			}

			i = i + 1;
		}

		System.out.println("The Loop Ended");
		System.out.println("=================================");
		System.out.println("The total is: " + sum);
		System.out.println("The Even total is: " + evenSum);
		System.out.println("The Odd total is: " + oddSum);
		System.out.println("=================================");


	}

}
