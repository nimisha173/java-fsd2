package set;
import java.util.*;
public class set {

	public static void main(String[] args) {
		Set <Integer> hset1=new HashSet<Integer>();
//		
			hset1.add(1);
			hset1.add(2);
			hset1.add(3);
			hset1.add(4);
		Set <Integer>hset2=new HashSet<Integer>();
		//Set<Integer>set=new HashSet<Integer>();
		
		hset2.add(5);
		hset2.add(2);
		hset2.add(6);
		hset2.add(4);
		//var result=hset1.retainAll(hset2);
		 //var set=
		hset1.retainAll(hset2);
				
			System.out.println(hset1);
  
	}

}
