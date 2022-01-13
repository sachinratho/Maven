package variable;

public class Local_variable {
	public   void velocity() {
		int A = 20;
		int B= 30;

		System.out.println(A +B );
	}

	public static void velocity1() {

		int C =11;
		int D= 22;
		System.out.println(C+D);

	}
	public static void main (String [] args ) {
		Local_variable C = new Local_variable ();
		C.velocity();
		velocity1();
	}
}