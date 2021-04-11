package basics;

import java.util.Scanner;

public class Swapping_of_Numbers_A {
	// using 3 variable
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping a = " + a +" "+"b = " + b);
		sc.close();
	}

}
