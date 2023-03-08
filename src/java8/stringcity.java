package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stringcity {

	public static void main(String[] args) {
		List<String> s=Arrays.asList("chennai","tvm","ernakulam","thiruppathi");
	List<String> city	=s.stream().filter(t->t.startsWith("t")).collect(Collectors.toList());
         System.out.println(city);
	}

}
