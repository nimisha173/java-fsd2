package arraylist;
import java.util.*;
public class arraylistforeach {

	public static void main(String[] args) {
		
     ArrayList<String>name=new ArrayList<String>();
     
     name.add("apple");
     name.add("mango");
     name.add("banana");
     name.add("grape");
     System.out.println(name);
     for(String fruit:name)
     System.out.println(fruit);
	}

}
