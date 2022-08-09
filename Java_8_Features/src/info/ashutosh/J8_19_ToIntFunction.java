package info.ashutosh;

import java.util.function.ToIntFunction;

public class J8_19_ToIntFunction {
	public static void main(String[] args) {
		/* take 'Integer' as a argument and return 'int' */
		ToIntFunction<Integer> toIntFunction = (i) -> i * i;
		System.out.println(toIntFunction.applyAsInt(10));
	}
}