import java.util.Scanner;


public class MinMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three number");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

/*
		if (a > b) {
			if (a > c) {
				System.out.println("The Max number is " + a);
			}else {
				System.out.println("The Max number is " + c);
			}
		}else{
			if (b > c) {
				System.out.println("The Max number is " + b);
			}else {
				System.out.println("The Max number is " + c);
			}
		}
		
*/		
		
		int maxVal = a > b ? (a > c ? a : c ) : (b > c ? b : c );
		
		System.out.println("The Max number is " + maxVal);
		

	}

}
