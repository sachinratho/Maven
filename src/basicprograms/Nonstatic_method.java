package basicprograms;

public class Nonstatic_method {


	public void demo() {
		System.out.println("THIS IS NON- STATIC METHOD");

	}

	public void demo1() {
		System.out.println("this is non-static method ");
	}

	public static void main(String[]args ) {
		Nonstatic_method A = new Nonstatic_method ();
		A.demo();
		A.demo1();

		//how to call nonstatic method in main method

		//class name object reference variable =new constructor followed by () ;

		//Nonstatic_method A =new Nonstatic_method ();--------1

		//class reference variable .class name ();------------2

		//for ex--------A.demo();
	}
}
