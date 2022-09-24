package irtct;

public class Tatkal {
public static void main(String[] args) {
	IrtctApp ia=new IrtctApp();
	User ravi=new User("ravi",65,ia);
	User anil=new User("anil",20,ia);
	User rushi=new User("rushi",20,ia);	
	User dhiraj=new User("dhiraj",20,ia);
	ravi.start();
	anil.start();
	rushi.start();
	dhiraj.start();
}
}
