package info.ashutosh;

import java.util.function.DoublePredicate;

public class J8_17_DoublePredicate {

	public static void main(String[] args) {
		// input type 'double' is already define by using DoublePredicate
		DoublePredicate doublePredicate = (i) -> i % 2 == 0;
		System.out.println(doublePredicate.test(23223422232.00d));
	}

}
