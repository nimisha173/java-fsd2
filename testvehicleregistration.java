package ustbatchno3.junit5testcases;

	
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import count.vehicleregistration;



public class testvehicleregistration {
	@Test
	 public void test() {
		List expected=Arrays.asList("Tamilnadu","KALLAR");
		String no="TN05BM6767";
		List actual1= vehicleregistration.sdataset(no);
		System.out.println(actual1);
		 assertEquals(expected,actual1);
		
	}

}
