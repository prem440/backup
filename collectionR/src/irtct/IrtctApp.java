package irtct;

public class IrtctApp {
	 int no_Of_Tickits = 100;

	public void bookTickits(int tickit, String name) {
		System.out.println("wel-come to irtct");
		System.out.println("how can i help you");
		 synchronized (this) {
			
		
		if (no_Of_Tickits > tickit) {
			no_Of_Tickits -= tickit;
			System.out.println("thank you for booking tickit" + tickit + "enjoy the journey" + name);
		} else {
			System.out.println("sory for inconveninous you are late");
			return;
		}
		System.out.println("no of tickit left==" + no_Of_Tickits);
	}
	}
}
