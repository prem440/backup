package one;

public class five {
	public static void main(String[] args) {

		System.out.println("start");

		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("checked exception handled");

		}
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exceptin handled");
		}
	}
}
