package abstraction2;

public class AUDI extends Carslogan {
	
	public static void welcomeAUDI() {
		
		System.out.println(" wc audi");
	}

	
	public void audi() {
		
	}

	
	public void hondacity() {
		
	}

	
	public void mahindra() {
		
	}

	
	public void nexon() {
		
	}
	public void ty1() {
		
		System.out.println(" thankU");
	}
	public static void main (String [] args ) {
		
		AUDI b = new AUDI();
		AUDI.CarFactory();
		AUDI.welcomeAUDI();
		b.ty1();
		AUDI.thankyou();
		
		//UPCASTING
		Carslogan n = new AUDI();
		n.CarFactory();
		n.thankyou();
		n.ty1();//ERROR
	}

}
