package basics;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber_A {
	public static void main(String[] args) {

		// using Math.random()
		double db = Math.random();

		System.out.println("The random number is " + db);

		// using ThreadLocalRandom class
		int a = ThreadLocalRandom.current().nextInt();
		System.out.println("The random number using this class is " + a);

		double d = ThreadLocalRandom.current().nextDouble();
		System.out.println("The random double number using this class is " + d);
		boolean b = ThreadLocalRandom.current().nextBoolean();
		System.out.println(b);

		// using java.util.random

		Random random = new Random();

		// includes range between 0-100 as we mentioned 100 here as an upper limit
		System.out.println(random.nextInt(100));
		System.out.println(random.nextDouble());
		System.out.println(random.nextLong());
	}
}
