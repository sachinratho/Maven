package operators;

public class LOGICAL_OR_and_BITWISE_OR {
	public void logandbitor() {
		//LOGICAL OR

		int x=450;
		int y=650;
		int z=100;
		int a=650;
		System.out.println(x>z||z<a);//true||true=true
		System.out.println(y>a||z<a);//false||true=true
		System.out.println(x>z||a!=y);//true||false=true
		System.out.println(x==z||z<=99);//false||false=false



	}

	public void longandbitor1() {
		int x=450;
		int y=650;
		int z=100;
		int a=650;
		System.out.println(x>z|z<a);//true|true=true
		System.out.println(y>a|z<a);//false|true=true
		System.out.println(x>z|a!=y);//true|true=true
		System.out.println(x==z|z<=99);//false|false=false


	}
	public static void main(String []args) {
		LOGICAL_OR_and_BITWISE_OR t =new LOGICAL_OR_and_BITWISE_OR();
		t.logandbitor();
		t.longandbitor1();
	}

}
