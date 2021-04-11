package basics;

import java.util.Scanner;

public class ArmstrongNumberB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int num = n;
		int total_Digit = 0;
		// This while loop is to find out number of digits
		// lets take 153
		// 153/10 remainder is 3 and quotient is 15
		// now 15 remainder is 5 and quotient is 1
		// now 1 remainder is 1 and quotient is 1
		// therefore this loop runs 3 times and total_Digit will be 3
		while (num > 0) {
			num = num / 10;
			total_Digit++;
		}

		num = n;
		int sum = 0;
		int r;
		while (num > 0) {
			r = num % 10;
			num = num / 10;
			// type casting because Math.Pow produces double value 
			sum = sum + (int) Math.pow(r, total_Digit);
		}
		if (sum == n) {
			System.out.println("It's an Armstrong Number");
		} else
			System.out.println("Not an ArmstrongNumber");
		sc.close();
	}

}
