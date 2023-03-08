package example;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		System.out.println("enter no");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p,s=0,r;
		
		p=n;
		while(n>0) {
			r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
if(s==p) {
	System.out.println("palindrom");
	
}else {
	System.out.println("not palindrom");
}
	}

}
