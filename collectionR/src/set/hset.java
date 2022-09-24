package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class hset {
	public static void main(String[] args) {
		Set<Student> hs = new HashSet<>();
		Student st = new Student(1, "akbar", "male");
		Student st1 = new Student(2, "birbal", "male");
		Student st2 = new Student(3, "jodha", "female");
		Student st3 = new Student(3, "jodha", "female");
		hs.add(st2);
		hs.add(st);
		hs.add(st3);
		hs.add(new Student(4, "muniya", "male"));
		System.out.println(st2.hashCode() + "-:-::-" + st3.hashCode());
		Iterator<Student> i = hs.iterator();
		while (i.hasNext()) {
			Student stt = i.next();

		}
		for(Object o:hs) {
			System.out.println(o);
		}

	}
}
