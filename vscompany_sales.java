/*viswa samudra is a construction company,they need a software to develop the application for the sales team to communicate with the customer.There is two
types of category for price table with material 1 squarefeet is 2000rs,without material 900rs.these price are for hyderabad location.

city        price(with)   price(without)
Tvm          1600          800
Chennai      1800          1000
Mumbai       2500          1200
Kochin       1800          1200

when a acustomer type his city and squarefeet he need to get the total amount for the construction. Write a java8 prgm and implement testNG for the testing.*/


package ustbatchno3.testng;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class vscompany_sales {
	
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    	
}
    
    
    
    
}
 /*public static void main(String[] args) {
	
	List<vscompanycustomer>vscompanycustomer = Collections.emptyList();
	vscompanycustomer c1 = new vscompanycustomer("TVM",1600,800);
	vscompanycustomer c2 = new vscompanycustomer("Chennai",1800,1000);
	vscompanycustomer c3 = new vscompanycustomer("Mumbai",2500,1200);
	vscompanycustomer c4 = new vscompanycustomer("Cochin",1800,1200);
    vscompanycustomer c5 = new vscompanycustomer("Hyderabad",2000,900);
    vscompanycustomer.add(c1);
    vscompanycustomer.add(c2);
    vscompanycustomer.add(c3);
    vscompanycustomer.add(c4);
    vscompanycustomer.add(c5);
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the city : ");
	String s = sc.next();
	System.out.println("Enter the square feet : ");
	int i = sc.nextInt();
	int p=0,g=0;
	if(i>0) {
		
		
		List price=vscompanycustomer.stream().filter(f->f.getCity().equals(s)).map(c->c.getPrice_with_material()*i ).collect(Collectors.toList());
		List price1=vscompanycustomer.stream().filter(f->f.getCity().equals(s)).map(c->c.getPrice_without_material()*i ).collect(Collectors.toList());
		
		System.out.println(price);
		System.out.println(price1);
		}
		
	}
}*/
