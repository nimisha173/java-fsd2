package java8customerdetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import java8comparesalary.comparesalary;

public class customerlistmain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		String a=sc.nextLine();
		ArrayList<customerlist> details=new ArrayList<customerlist>();
		/*customerlist d1=new customerlist("123","abhay","2673894678","abhay32@gmail.com","tvm");
		customerlist d2=new customerlist("124","abu","2673894345","abu22@gmail.com","ern");
		customerlist d3=new customerlist("125","abah","2673895478","abah2@gmail.com","ysn");
		List<customerlist> lis=details.stream().filter(findEmp->a.equals(findEmp.getRegid())).findAny().orElse(null);	*/	
		
		
		details.add (new customerlist("123","abhay","2673894678","abhay32@gmail.com","tvm"));
		details.add (new customerlist("124","abu","2673894345","abu22@gmail.com","ern"));
		details.add (new customerlist("125","abah","2673895478","abah2@gmail.com","ysn"));
    
		List<customerlist> lis= details.stream().filter(f->f.getRegid().equals(a)).toList();
		if(a.isEmpty()) {
			System.out.println("not found");
		}else
		     System.out.println(lis);
		     
	}
}
		
		



	
