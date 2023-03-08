package example;

import java.util.Scanner;

public class stringpal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    String s1=sc.next();
	    String s2="";
	    int l=s1.length();
	    for(int i=l-1;i>=0;i--) {
	    	s2=s2+s1.charAt(i);
	    }
	    if(s1==s2) {
	    	System.out.println("palindrom");
	    }else {
	    	System.out.println("not");
	    }
	   
		

	}

}
