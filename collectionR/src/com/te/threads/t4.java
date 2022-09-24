package com.te.threads;

public class t4  extends Thread {
	@Override
	public void run() {
		System.out.println();
		for (int i = 0; i < 11; i++) {
			if(i==15)
			{try {
				throw new RuntimeException();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
				
			}
			System.out.println(i+"---u2");
		}
		
		super.run();
		
	}
public static void main(String[] args) throws InterruptedException {
	
	Thread t=new Thread();
	t.start();
	t.setName("ravi");
	t.setPriority(MAX_PRIORITY);
	System.out.println(t.currentThread().getName());
	for (int i = 0; i < 10; i++) {
		System.out.println(i+"u:-2");
t.sleep(1000);
	}
	

		
	
}
	
	
	
	
	

}
