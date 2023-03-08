package hashset;

public class Student {
	 int id,age;
	  String name,dep;
	public Student(int id, int age, String name, String dep) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.dep = dep;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}

}
