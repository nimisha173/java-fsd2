package hashset;

import java.util.HashMap;

public class hashset {

	public static void main(String[] args) {
		HashMap<Integer,Student> map=new HashMap<>();
		
		Student s1=new Student(1,25,"ameya","finance");
		Student s2=new Student(2,26,"ammu","account");
		Student s3=new Student(3,27,"arun","health");
		map.put(1,s1);
		map.put(2,s2);
		map.put(3,s3);
		
		map.get(s1);
		System.out.println(s1);
		int h1=s1.hashCode();
		int h2=s2.hashCode();
		int h3=s3.hashCode();
		System.out.println(h1+" "+h3+" "+h3);
		

	}

}
