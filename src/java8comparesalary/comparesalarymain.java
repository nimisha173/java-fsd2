package java8comparesalary;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
import java8.Product;



public class comparesalarymain {

	public static void main(String[] args) {
		/*List<comparesalary> salary=new ArrayList<comparesalary>();
		salary.add(new comparesalary("121","arun",60000));
		salary.add(new comparesalary("132","ram",160000));
		salary.add(new comparesalary("125","bhavya",70000));
		if(getsalary()>50000) {
		List<Double>comparesalarymain=salary.stream().peek(e->e.getsalary((salary*(0.1))/100)).compare(salary::getsalary).collect(Collectors.toList());
		System.out.println(comparesalarymain);
		}else {
		List<Double>comparesalarymain=salary.stream().peek(e->((e.getSalary()*0.05)/100)).compare(salary::getsalary).collect(Collectors.toList());
		System.out.println(comparesalarymain);
		//System.out.println(comparesalarymain);*/
		
		
		
		ArrayList<comparesalary> salary=new ArrayList<comparesalary>();
		salary.add (new comparesalary("123", "Aadil", 200000));
		salary.add (new comparesalary("113", "Sasi", 2000));
		salary.add (new comparesalary("103", "Kundara", 70000));
			
			List<comparesalary> lis = salary.stream().sorted(Comparator.comparing(comparesalary::getSalary).reversed())
					.peek(k->{
					if((k.getSalary()>=50000)&&(k.getSalary()<100000))
						k.setSalary(k.getSalary()+(0.1)*k.getSalary());
					else if(k.getSalary()>=100000)
						k.setSalary(k.getSalary()+(0.05)*k.getSalary());
						}
				      ).toList();
					
			
						 
			System.out.println(lis);
			
		}


}
