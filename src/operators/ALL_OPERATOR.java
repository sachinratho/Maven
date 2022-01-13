package operators;

public class ALL_OPERATOR {
	int a;
	int  b ;
	int c;

	public ALL_OPERATOR (int a,int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;


	}
	public void binary () {
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a++);
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a);
		System.out.println(--a);
	}

	public void arithmatic() {

		System.out.println(a+b);
		System.out.println(b-c);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);

	}

	public void iffstatement() {
		if(c>b);{
			System.out.println("this is if ststement");
		}
	}
	public void name(int a ,double b) {
		double result=b*a;
		System.out.println(result);
	}



	public static void main (String []args) {
		ALL_OPERATOR t = new ALL_OPERATOR(11,22,33);
		t.binary();
		new ALL_OPERATOR(11,22,33);
		t.arithmatic();
		t.iffstatement();
		t.name(44,99);
	}


}
