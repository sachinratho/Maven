package basicprograms;

public class Mainmtd_staticmtd_nonstaticmtd {


	public static void main (String [] args) {

		System.out.println("THIS IS MAIN METHOD");

		//calling static method 

		demo();

		//calling nonstatic method 

		Mainmtd_staticmtd_nonstaticmtd A =new Mainmtd_staticmtd_nonstaticmtd ();

		A.demo1();
	}

	public static void demo() {

		System.out.println("this is static method");

	}

	public void demo1() {
		System.out.println("this is non-static method");
	}
}
