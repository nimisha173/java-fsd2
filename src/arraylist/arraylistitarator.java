package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylistitarator {

	public static void main(String[] args) {

		
			ArrayList<String>names=new ArrayList <String>();
		    names.add("mango");
		    names.add("apple");
		    names.add("grape");
		    System.out.println(names);
		   Iterator itr=names.iterator();
		   while(itr.hasNext()) {
			   System.out.println(itr.next());
		   }

	}

}
