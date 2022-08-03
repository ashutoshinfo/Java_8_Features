package info.ashutosh;

interface Intref {
	public void add(int a, int b);
}

public class J8_01_Lambda_Expressions {

	public static void main(String[] args) {
		// Once we write Lambda expressions to invoke functionality, then a Functional Interface is required.
		// We can use The functional Interface reference to refer Lambda Expression.
		Intref i = (a, b) -> System.out.print(a + b);
		// Calling Anonymous Function implementation
		i.add(5, 2);
	}

}
