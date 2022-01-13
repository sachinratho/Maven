package abstracttion;

public class HDFCbank extends PersionalDEtails{

	
	public void name() {
		System.out.println("sachin");
		
	}

	
	public void adharno() {

		System.out.println("837153285544");
	
		
	}

	
	public void mobileno() {
		
	}

	
	public void panno() {
		
	}
	
	public static void main (String [] args) {
		PersionalDEtails r= new HDFCbank();
		r.mtd();
		r.panno();
		r.accountCreated();
		
		
	}

}
