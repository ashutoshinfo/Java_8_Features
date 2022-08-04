package info.ashutosh;

import java.util.function.Function;

public class J8_09_Function {
	public static void main(String[] args) {
		Function<String, Integer> function = i -> i.length();
		Integer apply = function.apply("Ashutosh");
		System.out.println(apply);
	}

}
