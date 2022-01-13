package opps;

public class Father {


	public void land() {
		System.out.println("FATHER's LAND");
	}
	public void house() {
		System.out.println("FATHER's house");
	}
	protected void money() {
		System.out.println("FATHER's money");
	}
	public void car() {
		System.out.println("FATHER's car");
	}

	public static void main(String [] args ) {
		Father b = new Father ();
		b.money();
	}
}
