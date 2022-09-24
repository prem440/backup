package com.te.collection.Arraylist;

import java.util.HashSet;
import java.util.Set;

import set.Student;

public class third {
public static void main(String[] args) {
Student st=new Student(1, "ravi","male");
Student st1=new Student(2,"rushi","male");
Set<Student> hs=new HashSet<>();
hs.add(st1);
hs.add(st);
hs.add(new Student(3,"rajashree","female"));


}






}
