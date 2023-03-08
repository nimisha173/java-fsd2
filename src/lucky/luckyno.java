package lucky;

import java.util.Scanner;

public class luckyno {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[4];
		int flag=0;
		System.out.println("enter a 4 digit number");
		for(int i=0;i<4;i++) {
	      a[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++) {
			if(a[i]==3) {
				flag=flag+1;}
			
				if(a[i]==6) {
					flag=flag+1;
			}
				if(a[i]==9) {
					flag=flag+1;
				}
			}if(flag==1&&flag==1&&flag==1) {
			System.out.println("lucky");
			}
		
		}
}


