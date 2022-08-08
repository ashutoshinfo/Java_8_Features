package info.ashutosh;

import java.util.function.BiFunction;

public class J8_14_BiFuction {
	public static void main(String[] args) {
		/* take two arguments <Arguments,Arguments,Return Type> */
		BiFunction<Integer, Integer, Integer> biPredicate_sum = (i, j) -> (i + j);

		System.out.println(biPredicate_sum.apply(1, 2));

	}

}
