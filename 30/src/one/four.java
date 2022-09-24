package one;

import java.util.Iterator;

public class four {
	public static void main(String[] args) {
		int d[] = { 1, 2, 3, 4, 5, 6 };
		int e[] = { 1, 0, 2, 4 };
		try {

			for (int i = 0; i < d.length; i++) {
				try {
					System.out.println(d[i] / e[i]);
				}

				catch (ArrayIndexOutOfBoundsException e2) {
					System.out.println("fg");
				}
			}
		}

		catch (ArithmeticException e2) {
			// TODO: handle exception
			System.out.println("ai was handled");
		}

	}
}
