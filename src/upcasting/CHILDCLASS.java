package upcasting;

public class CHILDCLASS extends PARENTCLASS {
	public void bike() {
		System.out.println(" sons bike");
	}

	public void job() {
		System.out.println(" sons job");
	}
	public static void main (String [] args) {
		CHILDCLASS b= new CHILDCLASS();
		b.car();
		b.land();
		b.house();
		b.bike();
		b.job();


		//UPCASTING
		PARENTCLASS V= new CHILDCLASS();

		V.car();
		V.land();
		V.house();
	//	V.bike();//ERROR BECOUSE THIS MTD BELOGS TO CHILDCLASS
	//	V.job();//ERROR BECOUSE THIS MTD BELOGS TO CHILDCLASS


	}

}
