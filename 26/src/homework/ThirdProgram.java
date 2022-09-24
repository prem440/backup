package homework;

import java.util.Scanner;

public class ThirdProgram {

	static int sa;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the size of array");
		int d = sc.nextInt();
		arrayinput(d);
	}

	private static void arrayinput(int d) {
		int[] s = new int[d];
		for (int i = 0; i < s.length; i++) {
			System.out.println("enter the array elements");
			int element = sc.nextInt();
			s[i] = element;
			element = i;

		}
		for (int i = 0; i < s.length; i++) {
			System.out.print("{" + s[i] + "}");
			if (s[i] == 3) {
				sa++;

			}
		}

		if (sa == 3) {
			for (int i2 = 0; i2 < s.length; i2++) {
				int q = s[i2];
				q++;

			}
			System.out.println("true");
		}
	}

}
