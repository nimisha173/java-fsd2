 /*consider there is a textile industry. During the discussion about profit and loss, they wanted to design an application.
if given a date it should display total number of shirt,pant,saree sold and the total profit from each.implement java 8 code with TDD approach*/




package count;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class profit {

	

	public static long countgarments(List<String> items, LocalDate dateBefore) {
		// TODO Auto-generated method stub
		return items.stream().count();
	}

	public static long countprice(List<Integer> price, LocalDate dateBefore) {
		return price.stream().mapToInt(Integer::intValue).sum();
	}
	}
