package java8searchinghotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java8comparesalary.comparesalary;

public class hotelmain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your budjet");
		int b=sc.nextInt();
		ArrayList<hotel> bud=new ArrayList<hotel>();
		bud.add (new hotel(1500,"ginger"));
		bud.add (new hotel(2000, "safari"));
	    bud.add (new hotel(2500,"wel"));
	    List<hotel> lis = bud.stream().peek(k->{
	    	if((k.getBudjet()<1000)&&(k.getSalary()>=1500)) {
	    		System.out.println(lis);
	    	}
	    	else if()
				
	    }
		
		

	}

}
