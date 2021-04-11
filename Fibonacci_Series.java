package basics;

public class Fibonacci_Series {
	public static void main(String[] args) {
		int n = 100;
		int temp = 0;
		int temp1 = 1;
		System.out.println("Fibbanoci series ");
		while (temp < n) {
			System.out.print(temp + ",");
			int sum = temp + temp1;
			temp = temp1;
			temp1 = sum;
		}

	}

}
