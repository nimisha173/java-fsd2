package arraylist;
import java.util.LinkedList;
public class linkedmiddleelt {

	public static void main(String[] args) {
		LinkedList <Integer>ll=new LinkedList <Integer>();
		ll.addFirst(7);
		ll.addLast(67);
		ll.addLast(63);
		ll.addLast(33);
		ll.addLast(22);
		ll.addLast(23);
		//int e;
		System.out.println(ll);
		int middle=ll.get(ll.size()/2);
		System.out.println(middle);
		//for(int i=1;i<=6;i+=2) {
			//e=ll.get(i);
			//System.out.println(e);
		}
			
		}
		

	


