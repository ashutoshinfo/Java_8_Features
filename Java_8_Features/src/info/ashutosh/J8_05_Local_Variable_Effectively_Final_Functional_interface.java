package info.ashutosh;

interface Intref2 {
	public void method();

}

public class J8_05_Local_Variable_Effectively_Final_Functional_interface {

	public void m1() {
		int x = 10;
		Intref2 intref2 = () -> {
			System.out.println(x);
			/* Local variable x defined in an enclosing scope must be final or effectively final */
			// x = 11;
		};
		intref2.method();

	}

	public static void main(String[] args) {
		J8_05_Local_Variable_Effectively_Final_Functional_interface effectively_Final = new J8_05_Local_Variable_Effectively_Final_Functional_interface();
		effectively_Final.m1();
	}

}
