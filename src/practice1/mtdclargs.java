package practice1;

public class mtdclargs {
	public void velocity() {
		float side = 20;
		float mix=30;
		System.out.println(side+mix);

	}

	public void velocity(float side,float mix) {
		float values=side*mix;
		System.out.println(values);
	}

	public static void velocity(double ab ,double bb) {
		double result= ab*bb;
		System.out.println(result);
	}

	public static void  main (String []args) {
		mtdclargs t =new mtdclargs();
		t.velocity();
		t.velocity(41,44);
		velocity(66d,99d);
	}

}
