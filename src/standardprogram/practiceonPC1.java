package standardprogram;

public class practiceonPC1 {

	int a ;
	int b;

	practiceonPC1(int a1,int b1){
		a=a1;
		b=b1;

	}
	public void details() {
		System.out.println(a);
		System.out.println(b);

	}
	public static void main(String []args) {

		practiceonPC1 t=new practiceonPC1(100,200);
		t.details();

		practiceonPC1 s=new practiceonPC1(300,400);
		s.details();
	}



}
