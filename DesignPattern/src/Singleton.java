
public class Singleton {
	static Singleton st;
	static int t;

	private Singleton() {
		System.out.println("object created " + t + "times");
	}

	public static Singleton m1() {
		if (st == null) {
			t++;
			st = new Singleton();
		}
		return st;

	}

}
