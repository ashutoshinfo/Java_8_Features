package info.ashutosh;

import java.util.function.LongPredicate;

public class J8_16_LongPredicate {

	public static void main(String[] args) {
		// input type 'long' is already define by using LongPredicate
		LongPredicate longPredicate = (i) -> i % 2 == 0;
		System.out.println(longPredicate.test(2322342223243333232L));
	}

}
