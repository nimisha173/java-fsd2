package java8foodselection;

public class canteen {
private String uid;
private String name;
private String fid;

public String getId() {
	return uid;
}
public void setId(String uid) {
    this.uid=uid;
}
public String getName() {
	return name;
}
public void setName(String name) {
    this.name=name;
}
public String getFid() {
	return fid;
}
public void setFid(String fid) {
    this.fid=fid;
}

public canteen(String uid, String name, String fid) {
	super();
	this.uid = uid;
	this.name = name;
	this.fid = fid;
}
@Override
public String toString() {
	return "canteen [uid=" + uid + ", name=" + name + ", fid=" + fid + "]";
}




}