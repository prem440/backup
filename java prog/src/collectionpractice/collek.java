package collectionpractice;

import java.util.ArrayList;
import java.util.Iterator;

public class collek {
	public static void main(String[] args) {

		ArrayList<Integer> fg = new ArrayList<>();
		fg.add(12);
		fg.add(56);
		fg.add(73857);
		fg.add(623);
		System.out.println(fg.size());
		System.out.println(fg.isEmpty());
		System.out.println(fg.contains(12));
		Iterator<Integer> iterator = fg.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
//		for (Iterator iterator2 = fg.iterator(); iterator2.hasNext();) {
//			Integer integer = (Integer) iterator2.next();
//			System.out.println(integer);
//		}
		for (int i = 0; i < fg.size(); i++) {
			System.out.println(fg.get(i));
			
		}
		System.out.println("----------------------------------------");
		Object[] o=fg.toArray();
		
		for (int i = 0; i < o.length; i++) {
			System.out.println(o[i]);
			
		}
		Integer[] i=new Integer[fg.size()];
		i=fg.toArray(i);
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
			
		}
		}
	}
