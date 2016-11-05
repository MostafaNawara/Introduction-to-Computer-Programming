import java.util.Scanner;


public class TriangleCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		Scanner inpScanner = new Scanner(System.in);

		System.out.println("Enter The Triangle height:");
		
		int a = inpScanner.nextInt();
		int b = inpScanner.nextInt();
		int c = inpScanner.nextInt();
		
/*		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			System.out.println("It's a Triangle");
		}else{
			System.out.println("Not a Triangle");
		}*/
		
		if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
			System.out.println("Not a Triangle");
		}else{
			System.out.println("It's a Triangle");

		}
		

	}

}
