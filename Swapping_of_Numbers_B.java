package basics;

import java.util.Scanner;

public class Swapping_of_Numbers_B {
// without using 3rd variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping a = " + a + " " + "b = " + b);
		sc.close();

	}

}
