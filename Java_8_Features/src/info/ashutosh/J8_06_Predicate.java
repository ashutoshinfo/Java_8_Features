package info.ashutosh;

import java.util.function.Predicate;

public class J8_06_Predicate {
	public static void main(String[] args) {
		Predicate<Integer> predicate =i -> i > 0;
		boolean test = predicate.test(4);
		System.out.println(test);
	}

}
