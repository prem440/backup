package com.te.packages.interfacee;

public class casio implements calculator,scientific {

	

	@Override
	public int add(int x, int y) {
		int d=x+y;
		return d;
	}

	@Override
	public String trignometric(String a, String a2) {
		if(a.equals("sin") && a2.equals("cos")) {
			return "tan";
		}
		return "i dont know";
		
	}

	@Override
	public int sub(int x, int y) {
		int c=x-y;
		return c;
	
		
	}
public static void main(String[] args) {

}
}
