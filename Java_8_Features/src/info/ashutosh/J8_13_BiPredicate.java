package info.ashutosh;

import java.util.function.BiPredicate;

public class J8_13_BiPredicate {
	public static void main(String[] args) {
		/* take two arguments */
		BiPredicate<Integer, Integer> biPredicate = (i, j) -> (i + j) % 2 == 0;

		System.out.println(biPredicate.test(1, 2));

	}

}
