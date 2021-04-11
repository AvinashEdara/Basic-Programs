package basics;

import java.util.Scanner;

public class RandomNumber_B {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
// Here we made this type casting because Math.random() always leaves a double value
		int randomNumber = (int) (Math.random() * (max - min + 1) + min);
		System.out.println(randomNumber);
		sc.close();
	}
}
