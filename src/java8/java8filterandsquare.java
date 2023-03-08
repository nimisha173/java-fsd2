package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class java8filterandsquare {

	public static void main(String[] args) {
		List<Integer> s=Arrays.asList(1,4,6,7);
		
		List<Integer>squarelist=s.stream().filter(t->t%2==0).map(t->t*t).collect(Collectors.toList());
	
		System.out.println(squarelist);
		

	}

}
