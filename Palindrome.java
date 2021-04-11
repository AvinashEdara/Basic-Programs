package basics;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// String str = " ";
		System.out.println("Enter the string ");
		String a = sc.next();
		int i = 0;
		int j = a.length() - 1;
		while (i < j) {
			if (a.charAt(i) != a.charAt(j))
				System.out.println("Not a Palindrome");
			else
				System.out.println("Palindrome");
			i++;
			j--;
			System.exit(0);
			sc.close();
		}
	}
}
