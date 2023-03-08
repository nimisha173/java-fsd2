package hashmap;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("anu",37);
		map.put("abu",28);
		map.put("paru",83);
		map.put("abdul",26);
		map.put("sidhu",73);
		int age=map.get("abu");
		System.out.println(age);
		System.out.println("hash table"+map);
		//remove
		map.remove("abu");
		System.out.println("abu is removed");
		System.out.println("hash table"+map);
		boolean containsabu=map.containsKey("abu");
		System.out.println(containsabu);
		
		

	}

}
