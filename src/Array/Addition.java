package Array;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		int c[]=new int[n];
		int sum=0;
		System.out.println("enter the elements");
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();}
			for(int i=0;i<n;i++) {
			sum=sum+a[i];
			c[i]=sum;
	
	
		}
		System.out.println("final result is");
		for(int i=0;i<n;i++) {
			System.out.println(c[i]+" ");
		}
	}

}
;