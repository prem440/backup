package homework;

import java.util.Scanner;

public class AsManyInput {
	static long e;
	public static void main(String[] args) {
		AsManyInput a=new AsManyInput();
		a.add();
	}

	private void add() {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no to give addition other than 0");
		long d=s.nextLong();
		hectic(d);
		
	}

	private static void hectic(Long d) {
		if(e==0) {
			e=d;
			System.out.println(e);
		}
		
		else {
			e=d+e;
			System.out.println(e);
		}
		AsManyInput s=new AsManyInput();
		
		s.add();
	}
	
}