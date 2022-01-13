package loops;

public interface interface1 extends interface2 ,interface3{
	int a = 10;// we need to declere plus initialize at a same time otherwise it shows error ex.int a; not possible
	public  static void start() {
		System.out.println(" welcome to the bank of application ");
		
	}
	 void fullname();
	 void adharno();
	void  mobileno();
	static void last () {
		System.out.println(" THANK YOU");
		System.out.println(a);
		
	}
	public static void main (String [] args ) {
		start() ;
		 last ();
		
	}

}
