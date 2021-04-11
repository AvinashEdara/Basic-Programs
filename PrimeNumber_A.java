package basics;

import java.util.Scanner;

public class PrimeNumber_A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = true;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(n + " is a prime number ");
		} else {
			System.out.println(n + " is not a prime number");
		}
		sc.close();
	}

}
