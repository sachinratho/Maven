package operators;

public class Shiftoprtr {

	public void leftShift() {
		//Leftshift operator <<
		//<<=*2^
		int s=20;
		System.out.println(s<<2);//20*2^2=80
		System.out.println(s<<3);//20*2^3=160
		System.out.println(s<<4);//20*2^4=320

	}
	public void leftShift1() {
		//right shift >>
		//>>=/2^

		int y=40;
		System.out.println(y>>2);//40/2^2=5
		System.out.println(y>>3);//40/2^3=10
		System.out.println(y>>4);//40/2^4=2

		////////>>>
		System.out.println(y>>>2);//40/2^2=5
		System.out.println(y>>>3);//40/2^3=10
		System.out.println(y>>>4);//40/2^4=2



	}
	public static void main (String []args ) {
		Shiftoprtr t =new Shiftoprtr() ;
		t.leftShift();
		t.leftShift1();


	}

}

