package arraylist;
import java.util.*;
public class arraysum {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		int flag=0;
		for(int i=0;i<25;i+=5) {
		    list.add(i);
		}
		System.out.println(list);
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
			if(list.get(i)+list.get(j)==25) {
				flag=flag+1;
			}
		}
			}
		if(flag>0) {
			System.out.println("present,\n"+flag+"times");
		}
		


	}
}


