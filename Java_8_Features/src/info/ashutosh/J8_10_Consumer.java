package info.ashutosh;

import java.util.function.Consumer;

public class J8_10_Consumer {
	public static void main(String[] args) {
		Consumer<String> consumer = (s) -> System.out.println(s);
		consumer.accept("Ashutosh");
	}

}
