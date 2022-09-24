package one;

public class checked {
public static void main(String[] args) {
	System.out.println("program start");
	try {
		new checked().m1();
	} catch (Exception e) {
	System.out.println("from main");
	}
	System.out.println("end");
}

public void m1() {
	
	try {
		m2(1);
	} catch (Exception e) {
		e.printStackTrace();
}
}

private void m2(int i) throws Exception {
	if(i==1)
		throw new Exception();
	
}}
