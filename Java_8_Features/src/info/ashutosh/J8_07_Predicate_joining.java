package info.ashutosh;

import java.util.function.Predicate;

public class J8_07_Predicate_joining {
	public static void main(String[] args) {
		int[] x = { 1, 2, 3, 4, 5, 6 };

		Predicate<Integer> p1 = (i) -> i > 3;
		Predicate<Integer> p2 = (i) -> i % 2 == 0;
		System.out.println("Greter then 3 :");
		m1(p1, x);
		System.out.println("Even no :");
		m1(p2, x);

		System.out.println("Less then 3 :");
		m1(p1.negate(), x);

		System.out.println("Greter then 3 and even :");
		m1(p1.and(p2), x);

		System.out.println("Greter then 3 or even :");
		m1(p1.or(p2), x);

	}

	private static void m1(Predicate<Integer> p, int[] x) {

		for (int i : x) {
			if (p.test(i)) {
				System.out.println(i);
			}
		}

	}

}
