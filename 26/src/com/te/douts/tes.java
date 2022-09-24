package com.te.douts;

public class tes implements Cloneable{

public Object clone() throws CloneNotSupportedException {
	return super.clone();
}
String n="ravi";
public static void main(String[] args) throws CloneNotSupportedException {
	tes r=new tes();
	tes obj2=(tes)r.clone();
	System.out.println(r.n);
	System.out.println(obj2.n);
	String aa=new String("ravi");
	String bb="rai";
	
System.out.println(aa.getClass().getName().hashCode());
System.out.println(bb.getClass().getName().hashCode());
System.out.println(r.clone());
}

}
