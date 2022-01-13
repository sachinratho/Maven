package operators;

public class ArithmaticOprtr {
	public void arith() {
		int a=10;
		int b=20;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); // ans  will always quotient 
		System.out.println(a%b);// ans will always reminder

	}

	public static void main (String []args) {
		ArithmaticOprtr t = new ArithmaticOprtr();
		t.arith();
	}
}
