package one;

public class autopropogation {
	void m1() {
		try {
			m2();
		} catch (Exception e) {
			System.out.println("exception is handled");
			// TODO: handle exception
		}

	}

	void m2() {
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			
			System.out.println("handled in m2");
		}
	}

	public static void main(String[] args) {
		System.out.println("start program");
		new autopropogation().m1();// annonimious object does not have name
		System.out.println("end program");
	}
}
