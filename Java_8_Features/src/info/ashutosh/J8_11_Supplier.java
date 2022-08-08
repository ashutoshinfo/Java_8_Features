package info.ashutosh;

import java.util.function.Supplier;

public class J8_11_Supplier {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> {
			String[] names = { "Ashutosh", "Kruti", "Jayesh", "Kokila" };
			int random = (int) (Math.random() * 4);
			return names[random];
		};
		System.out.println(supplier.get());
	}

}
