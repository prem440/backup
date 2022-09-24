package set;

import java.util.HashSet;

import com.te.collection.Arraylist.third;

public class Student implements Comparable<Student>{
	private int rollno;
	private String name;
	private String gender;


	

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", gender=" + gender + "]";
	}

	
	@Override
	public int hashCode() {
		
		return hashCode();
	}

	public Student(int rollno, String name, String gender) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.gender = gender;
	}


	@Override
	public boolean equals(Object obj) {
		Student st = (Student) obj;
		if(this.name==st.name && this.rollno==st.rollno && this.gender==st.gender)
			return true;
	
			return false;
	}



	


	@Override
	public int compareTo(Student o) {
		
		return this.gender.compareTo(o.gender);
	}

}
