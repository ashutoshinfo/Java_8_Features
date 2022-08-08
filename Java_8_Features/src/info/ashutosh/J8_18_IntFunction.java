package info.ashutosh;

import java.util.function.IntFunction;

public class J8_18_IntFunction {
	public static void main(String[] args) {
		/* take 'int' as a argument and return Integer */
		IntFunction<Integer> intFunction = (i) -> i * i;
		System.out.println(intFunction.apply(10));

	}
}
