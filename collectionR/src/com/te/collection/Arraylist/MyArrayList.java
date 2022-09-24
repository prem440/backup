package com.te.collection.Arraylist;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList {
	private Object[] arrays;
	private int size;
	private int index;

	public MyArrayList() {
		arrays = new Object[10];
	}

	public int size() {
		return index;

	}

	public void add(Object obj) {
		if (index >= arrays.length - 1) {
			increasecapacity();
		}
		arrays[index] = obj;
		index++;
	}

	private void increasecapacity() {
		Object[] temp = new Object[((arrays.length * 3) / 2) + 1];
		for (int i = 0; i < arrays.length; i++) {
			temp[i] = arrays[i];
		}
		arrays = temp;
	}

	public void remove(Object obj) {
		for (int i = 0; i < index; i++) {
			if (arrays[i].equals(obj)) {
				for (int j = i; j < index; j++) {
					arrays[j] = arrays[j + 1];
				}
				index--;
				return;
			}
		}
	}

	public Object get(int index) {
		return arrays[index];

	}
public Iterator<Object> iterator(){
	return new MyItr();
}
	@Override
	public String toString() {
		return "MyArrayList [Arrays=" + arrays.toString() + ", size=" + size + ", index=" + index + "]";
	}

	class MyItr implements Iterator<Object> {
		int index;
		MyArrayList aa = new MyArrayList();

		@Override
		public boolean hasNext() {
			if (arrays[index] != null) {
				return true;

			}
			return false;
		}

		@Override
		public Object next() {
			Object obj=arrays[index];
			index++;
			

			return obj;
		}

	}
}