package com.te.packages;

public class smartphone extends inhrtc {
int ram ;
int cam; 
public smartphone(String name,double price,String color,int r,int c)
{
super(name,price,color);	
this.cam=cam;
this.ram=ram;
}
public void browse() {
	System.out.println("browsing");
}
public void game() {
	System.out.println("gaming");
	
}
public void vcall() {
	System.out.println();
}
}
