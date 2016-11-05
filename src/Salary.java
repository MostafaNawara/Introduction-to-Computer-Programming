import java.util.Scanner;


public class Salary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the employer performance rating from (1-3)");
		
		int rating = input.nextInt();
		
		if (rating == 1) {
			System.out.println("Excellent!, An employer will receive 6% raise");
		} else if (rating == 2){
			System.out.println("Good!, An employer will receive 4% raise");
		}else if (rating == 3) {
			System.out.println("Poor!, An employer will receive 1.5% raise");
		}else {
			System.out.println(":(, Rating is error enter rate from 1 to 3");
		}
	}

}
