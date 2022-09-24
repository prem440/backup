package homework;

import java.util.Scanner;

public class Fabonacci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter element to calculate fabonacci series");
	int FirstNo=sc.nextInt();
	int a=0;
	int b=1;
	
	int d=0;
	for(int i=a;i<FirstNo;i++,b++) {
		d=a+b;
		System.out.println(" "+d);
		a=b;
		b=a;
	}
	
}
}
