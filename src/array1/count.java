package array1;

public class count {

	public static void main(String[] args) {
		int a[]= {4,-4,6,8,-9,0,4,-7,56};
		   int length=a.length;
		   int p=0;
		   int n=0;
		   for(int i=0;i<length;i++) {
			   if(a[i]==0) {
				   continue;
			   }
			   if(a[i]<0) {
				   n=n+1;
				   }
			   else {
				   p=p+1;
			   
			   
		   }}
System.out.println(p);

System.out.println(n);
	}
}

