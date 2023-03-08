package Kgfb;

public  class savings extends Account implements maintanance {

	public savings(String accno, String cname, double balance) {
		super(accno, cname, balance);
	}
		public float calculatemaintenancecharge(float noofyears) {
			int m=50;
			float maintanancecharge=(m*noofyears)+50;
			System.out.println("maintanance charge for savings account");
			return maintanancecharge; 
			}
		
	}


