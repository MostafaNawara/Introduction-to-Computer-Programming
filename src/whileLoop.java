import java.util.Scanner;


public class whileLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the \"start & end\" of the loop");
		
		int startLoop = input.nextInt();
		int endLoop = input.nextInt();
		
		int i = startLoop;
		
		if (startLoop < endLoop) {

			while (i <= endLoop) {
				System.out.println(i);
				i = i + 1;
			}
			System.out.println("End Loop");
		}else {
			System.out.println("The loop start bigger than the end");
		}

	}

}
