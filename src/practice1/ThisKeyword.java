package practice1;

public class ThisKeyword {

	int a;
	int b;
   double value;
	public void example(int a,int b,double value) {

		this.a=a;
		this.b=b;
		this. value =value;
	   double result=a+b+value;
		System.out.println(result);


	}
	public static void main (String []args) {

		ThisKeyword t = new ThisKeyword();
		t.example(55,66,58);
		t.example(77,99,66);
	}

}
