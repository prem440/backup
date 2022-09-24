package com.te.practice;

public class tye {
	int a = 9;
	static int b = 0;
	final static int c = 67;
	final int d = 6;
	static {
		System.out.println(b);
		System.out.println(c);
		//System.out.println(a);
		//System.out.println(d);

	}
	{
		int c = 0;
		System.out.println(b);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d); 

	}

	public static void main(String[] args) {
		add();
	}

	private static void add() {
		// TODO Auto-generated method stub
		int b = 8;
		System.out.println(b);
		System.out.println(b);
		System.out.println(c);
		tye t = new tye();
		t.add(10);
		System.gc();

	}
@Override
protected void finalize() throws Throwable {
	
	super.finalize();
}
	private void add(int i) {
		System.out.println(b);
		System.out.println(i);
		System.out.println(c);
		System.out.println(d);

	}

}
