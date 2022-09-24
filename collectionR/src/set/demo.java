package set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class demo {
	public static void main(String[] args) {
		Set<Student> ts = new TreeSet<>();
		ts.add(new Student(1, "Ravi", "Male"));
		ts.add(new Student(2, "rani", "Female"));
		ts.add(new Student(3, "sujay", "male"));
		
		Iterator<Student> iterator = ts.iterator();
     while (iterator.hasNext()) {
		Student student = (Student) iterator.next();
		System.out.println(student);
	}
	}
}
