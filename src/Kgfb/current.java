package Kgfb;

public class current extends Account implements maintanance {

	public current(String accno, String cname, double balance) {
		super(accno, cname, balance);
	}
	public float calculatemaintenancecharge(float noofyears) {
		int m=100;
		float maintanancecharge=(m*noofyears)+200;
		System.out.println("maintanance charge for current account");
		return maintanancecharge; 
		}
	
			
	}


