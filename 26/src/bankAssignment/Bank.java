package bankAssignment;

public class Bank {
	static double d=6000;
	public void balance(double f) {
		
		if(f <d) {
			try {
			throw new InsufficientBalanceException("in your accout please maintain  balance");
			}
			catch (Exception e) {
			System.out.println(e.getMessage());
			}
			}
			else
				System.out.println("thank you for maintaining ballance");
			}
	public static void main(String[] args) {
		user u1=new user(1,"ravi", 6004);
		
		Bank b=new Bank();
		b.balance(u1.getBalance());
		
		
	}

}
