package irtct;

public class User extends Thread{
	String name;
	int tickit;
	IrtctApp i;
	public User(String name, int tickit, IrtctApp i) {
		super();
		this.name = name;
		this.tickit = tickit;
		this.i = i;
	}
@Override
public void run() {
	i.bookTickits(tickit, name);
	super.run();
}
}
