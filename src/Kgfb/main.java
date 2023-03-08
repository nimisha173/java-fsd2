package Kgfb;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("1.savings account\n 2.current account\n enter your choice");
		int c=s.nextInt();
		System.out.println("enter name");
	    String cname=s.next();
		System.out.println("enter account number");
		String accno=s.next();
		
	    System.out.println("enter balance");
	    double balance=s.nextDouble();
	    System.out.println("enter no of years");
	    int noofyears=s.nextInt();
	    maintanance a=new savings(accno,cname,balance);
	    maintanance b=new current(accno,cname,balance);
	    if(c==1) {
	    	System.out.println(a.calculatemaintenancecharge(noofyears));
	    }else {
	    System.out.println(b.calculatemaintenancecharge(noofyears));
	
	}

}}
