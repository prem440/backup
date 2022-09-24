package homework;

import java.util.Scanner;

public class ArrayReverse {
	static int b[];

	public static void main(String[] args) {
		ArrayReverse b = new ArrayReverse();
		b.insertelements();
	}

	private void insertelements() {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size of arrayLength");
		int a = s.nextInt();
		b = new int[a];
		for (int c = 0; c < b.length; c++) {
			System.out.println("enter the elements of array");
			int d = s.nextInt();
			b[c] = d;
		}
		
		ArrayReverse ar = new ArrayReverse();

		ar.display();
	}

	
	private void display() {
		for (int z = b.length - 1; z >= 0; z--) {
			// System.out.print("array elements in reverse order");
			System.out.println("{" + b[z] + "}");
			
			
		}

	}

}
