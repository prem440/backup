package homework;

import java.util.Scanner;

public class ArrayLength {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("enter the size of array");
		int a = sc.nextInt();
		ArraySize(a);
	}

	private static void ArraySize(int a) {
		int d[] = new int[a];
		for (int i = 0; i < d.length; i++) {
			System.out.println("enter the array elements");
			int a1 = sc.nextInt();
			d[i] = a1;
			a1 = i;

		}
		System.out.println(d[0]);
		System.out.println(d[1]);

	}

}
