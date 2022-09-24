package CustomException;

public class Election {
	public void vote(int age) {
		if (age < 18) {
			try {
				throw new NotEligibleException("the voter is not eligible to vote");

			} catch (NotEligibleException e) {
				System.out.println(e.getMessage());

			}
		} else
			System.out.println("casted vote successfully");
	}

	public static void main(String[] args) {
		voter v1 = new voter(21, "ravi", 2);
		voter v2=new voter(15,"kavita",1);

		Election e = new Election();
		e.vote(v1.getAge());
		e.vote(v2.getAge());

	}
}
