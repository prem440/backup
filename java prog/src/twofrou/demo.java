package twofrou;

public class demo {
	public static void main(String[] args) {
		first f = new first();
		f.mname = "a9 2018";
		f.cam = 4;
		f.batteryc=4500.0;
		second s = new second();
		s.compnyname = "Samsung Electorics Co.ltd (416 matean 3- dong yeongtong -gu suwon south koria)";
		s.price = 38931;
		f.address =s;
		System.out.println("mobile compony address is "+f.address.compnyname);
		System.out.println("mobile price is"+f.address.price);
		System.out.println("batter capacity"+f.batteryc);
		System.out.println("mobile name"+f.mname);
	}

}
