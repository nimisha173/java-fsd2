package Kgfb;

public abstract class Account {
	String accno;
	String cname;
	double balance;
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(String accno, String cname, double balance) {
		super();
		this.accno = accno;
		this.cname = cname;
		this.balance = balance;
	}

}
