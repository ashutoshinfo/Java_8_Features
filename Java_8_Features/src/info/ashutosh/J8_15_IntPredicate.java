package info.ashutosh;

import java.util.function.IntPredicate;

public class J8_15_IntPredicate {

	public static void main(String[] args) {
		// input type 'int' is already define by using IntPredicate
		IntPredicate intPredicate = (i) -> i % 2 == 0;
		System.out.println(intPredicate.test(6));
	}

}
