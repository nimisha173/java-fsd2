package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class java8square {

	public static void main(String[] args) {
		List<Integer> s=Arrays.asList(1,3,6,8);
		List<Integer>square=s.stream().map(t->t*t).collect(Collectors.toList());
		System.out.println(square);

	}

}
