package operators;

public class Logical_AND_Bitwise_AND {

	public void ANDoperator() {


		//&&=LOGICAL AND

		int x=450;
		int y=650;
		int z=100;
		int a=650;
		System.out.println(x>z&&z<a);//true&&true=true
		System.out.println(y>a&&z<a);//false&&false=false
		System.out.println(x>z&&a!=y);//true&&false=false
		System.out.println(x==z&&z<=99);//false&&false=false



	}

	public void ANDoperators1() {

		// &= BITWISE AND

		int x=450;
		int y=650;
		int z=100;
		int a=650;
		System.out.println(x>z&z<a);//true&true=true
		System.out.println(y>a&z<a);//false&false=false
		System.out.println(x>z&a!=y);//true&false=false
		System.out.println(x==z&z<=99);//false&false=false

	}

	public static void main (String []args ) {
		Logical_AND_Bitwise_AND t = new Logical_AND_Bitwise_AND();
		t.ANDoperator();
		t.ANDoperators1();
	}
}