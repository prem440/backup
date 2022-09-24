package mock;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Test {
public static void main(String[] args) {
	HashMap<Integer,String> hs=new HashMap<>();
	hs.put(1, "ravi");
	hs.put(2, "amit");
	hs.put(3, "manish");
	hs.put(4, "anil");
	hs.put(5, "mohit");
	for (Map.Entry<Integer, String> entry : hs.entrySet()) {
		Integer key = entry.getKey();
		String val = entry.getValue();
		System.out.println(val);
	}
		ArrayList<Test>al=hs.keySet() 
}
}
