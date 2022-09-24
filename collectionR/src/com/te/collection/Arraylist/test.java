package com.te.collection.Arraylist;

import java.util.Iterator;

import com.te.collection.Arraylist.MyArrayList.MyItr;

public class test {
	public static void main(String[] args) {
		MyArrayList r= new MyArrayList();
		r.add(101);
		r.add(102);
		r.add(103);
		r.add(103);
		r.add(104);
		r.add(105);
		r.add(106);
		r.add(107);
		r.add(108);
		r.add(109);
		
		
		
		System.out.println(r.size());
		
		
		r.remove(106);
		Iterator<Object> i=r.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
	}

}
