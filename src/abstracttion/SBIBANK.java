package abstracttion;

public class SBIBANK extends PersionalDEtails  {

	//   HERE I HAVE IMPLEMENTED THE ABSTRCAT CLASS
	
	// WE CAN DO UPCASTING HERE
	public void name() {
		
		System.out.println(" SACHIN SHANKAR RATHOD ");
		
	}

	
	public void adharno() {

		
		System.out.println(" 837153285511 ");
		
	}

	
	public void mobileno() {
		

		
		System.out.println(" 9158683662 ");
		
		
	}

	
	public void panno() {
		

		
		System.out.println(" EVH884574 ");
		
		
		
		
	}
	public static void main (String [] args ) {
		
		PersionalDEtails b = new SBIBANK ();
		b.name();
		b.adharno();
		b.mobileno();
		b.panno();
		b.accountCreated();
		b.accountopen();
	}
	
	

}
