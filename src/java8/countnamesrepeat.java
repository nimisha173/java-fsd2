package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countnamesrepeat {

	public static void main(String[] args) {
		List<String> s=Arrays.asList("anu","anu","binu","riva","anu","binu");
		System.out.println(s);
			List<String> stringcount=s.stream().filter(i->Collections.frequency(s, i)>1).collect(Collectors.toList());
			long total=stringcount.stream().count();
			 System.out.println(total);
		

	}

}
