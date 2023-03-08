package Greater;

public class largerno {

	public static void main(String[] args) {
		int a[]= {5,3,8,1,7,2};
	   int length=a.length;
	   int max=a[0];
	   
	   for(int i=1;i<length;i++) {
		   
			   if(a[i]>max) {
				   
				   max=a[i];
			   }
		   }
		   System.out.println(max);
	   }

	}

