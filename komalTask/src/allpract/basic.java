package allpract;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class basic {
	public static void main(String[] args) {
		
	
	String a[]= {"ravi", "kavi","navi","savi"};
	Stream.of(a);
	List<String> alist=Arrays.asList(a);
	alist.stream();
	}
}
