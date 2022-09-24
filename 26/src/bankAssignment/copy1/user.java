package bankAssignment.copy1;

public class user {
private int Ac_no;
private String name;
private double balance;
public int getAc_no() {
	return Ac_no;
}
public void setAc_no(int ac_no) {
	Ac_no = ac_no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public user(int ac_no, String name, double balance) {
	super();
	Ac_no = ac_no;
	this.name = name;
	this.balance = balance;
}

}
