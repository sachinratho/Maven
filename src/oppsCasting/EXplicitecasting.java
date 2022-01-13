package oppsCasting;

public class EXplicitecasting {

	public static void main(String [] args ) {
		long l= 3000;
		int i =(int) l;
		System.out.println(i);

		double d = 4445.77;
		int b = (int)d;// LOWER TO HIGHER DATATYPES IN WHICH SOME LOSSES HAPPENS LIKE AFTER POINT VALUE WILL NOT COME  JUST LIKE HERE IN INT 
		//	INT VALUE IS 445.77 BUT ANS COMES 4445 ONLY
		System.out.println(b);
	}

}
