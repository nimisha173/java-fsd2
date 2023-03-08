package java8searchinghotel;

public class hotel {
    int budjet;
    String name;
	public int getBudjet() {
		return budjet;
	}
	public void setBudjet(int budjet) {
		this.budjet = budjet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public hotel(int budjet, String name) {
		super();
		this.budjet = budjet;
		this.name = name;
	}
	@Override
	public String toString() {
		return "hotel [budjet=" + budjet + ", name=" + name + "]";
	}

}
