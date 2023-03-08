package java8customerdetails;

public class customerlist {
	
	
	@Override
	public String toString() {
		return "customerlist [regid=" + regid + ", name=" + name + ", phoneno=" + phoneno + ", email=" + email
				+ ", location=" + location + "]";
	}
	String regid;
	String name;
	String phoneno;
	String email;
	String location;
	public String getRegid() {
		return regid;
	}
	public void setRegid(String regid) {
		this.regid = regid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public customerlist(String regid, String name, String phoneno, String email, String location) {
		super();
		this.regid = regid;
		this.name = name;
		this.phoneno = phoneno;
		this.email = email;
		this.location = location;
	}

}
