package info.ashutosh;

import java.util.function.Supplier;

public class J8_11_Supplier {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> {
			String aToZ = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$&";
			Supplier<Integer> randomInt = () -> (int) (Math.random() * aToZ.length());
			String finalOtpString = "";
			for (int i = 0; i < 6; i++) {
				finalOtpString = finalOtpString + aToZ.charAt(randomInt.get());

			}

			return finalOtpString;
		};

		System.out.println(supplier.get());

	}

}
