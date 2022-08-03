package info.ashutosh;

public class J8_02_Multithreading {

	/**
	 * 
	 * @author Ashutosh Patel
	 */

	public static void main(String[] args) {
		// Implementation of run method
		Runnable runnable = () -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println(Thread.currentThread().getName());
			}
		};

		Thread thread = new Thread(runnable);
		thread.start();

		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
