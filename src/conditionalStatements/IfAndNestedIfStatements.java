package conditionalStatements;

public class IfAndNestedIfStatements {
	public static void main (String []args) {

		IfAndNestedIfStatements t =new IfAndNestedIfStatements();
		t.check2();
		t.check1();

	}


	public void check2() {

		int s=22;
		int t=24;

		if (s>21 &&s<44) {
			if( t>21&&t<44) {
				System.out.println("both are eligible for marriage");
			}
		}



	}
	public void check1() {
		int age =21;
		if (age>18) {
			if (age<44) {

				System.out.println("eligible for vaccine");
			}
		}

	}


}
