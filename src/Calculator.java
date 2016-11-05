import java.util.Scanner;


public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		
		int x = input.nextInt();
		int y = input.nextInt();
		
		System.out.println("Enter the operation character, You cane use (+, -, /, %, *): ");
		
		String operator = input.next();


		int plus = x + y;
		int minus = x - y;
		int multiply = x * y;
		int divide  = x / y;
		int modulus  = x % y;

		if (operator.contains("+")) {

			System.out.println(plus);

		}else if(operator.contains("-")){

			System.out.println(minus);

		}else if(operator.contains("*")){

			System.out.println(multiply);
		
		}else if(operator.contains("/")){

			System.out.println(divide);
		
		}else if(operator.contains("%")){

			System.out.println(modulus);

		}
		
	}

}
