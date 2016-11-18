import java.util.Scanner;


public class EmployeeGrossSale {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of Employees:");
		
		int employers = input.nextInt();
		int [] salarys = new int [employers];

		String [] rangesText = {"200 – 299", "300 – 399", "400 – 499", "500 – 599", "600 – 699", "700 – 799", "800 – 899", "900 – 999", "Over 1000"};

		int [] RingValues = {0, 0, 0, 0, 0, 0, 0, 0, 0};

		System.out.println("Enter the Employers salary: ");
		
		for (int i = 0; i < employers; i++) {
			salarys[i] = input.nextInt();
		}

		for (int i = 0; i < employers; i++) {
			int num = salarys[i];

			if (num >= 200 && num <= 299) {
				RingValues[0]++;
			}else if (num >= 300 && num <= 399) {
				RingValues[1]++;
			}else if (num >= 400 && num <= 499) {
				RingValues[2]++;
			}else if (num >= 500 && num <= 599) {
				RingValues[3]++;
			}else if (num >= 600 && num <= 699) {
				RingValues[4]++;
			}else if (num >= 700 && num <= 799) {
				RingValues[5]++;
			}else if (num >= 800 && num <= 899) {
				RingValues[6]++;
			}else if (num >= 900 && num <= 999) {
				RingValues[7]++;
			}else if (num >= 1000) {
				RingValues[8]++;
			}
		}
		
		System.out.println("Total " + employers + " Employees Reported");
		System.out.println("Employees in the range:");

		for (int i = 0; i < rangesText.length; i++) {
			// String ringName = "Ring_" + i;
			System.out.println(rangesText[i] + " : " + RingValues[i]);
		}
		

	}

}
