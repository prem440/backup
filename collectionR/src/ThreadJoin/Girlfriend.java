package ThreadJoin;

public class Girlfriend extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println("i am on the way   ---"+Thread.currentThread().getName());			
		}

		super.run();
	}

}
