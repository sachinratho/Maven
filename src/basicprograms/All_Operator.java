package basicprograms;


	public class All_Operator {
		  int m =450;
		  int n=650;
		  int o=100;
		  int p=650;
		public static void unary() {
			System.out.println("Unary Operator is=");
			int i=10;
			System.out.println(i);
			System.out.println(i++);
			System.out.println(i);
		}
		public void arithmatic() {
			System.out.println("Arithmatic Operator is=");
			int a=10;
			int b=20;
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
		}

		public static void leftshift() {
			System.out.println("Left Shift Operator is=");
			int s=20;
			System.out.println(s<<2);
			System.out.println(s>>3);
		}
		
		
		  public void rightshift(int s,int u) {
			  System.out.println("Right Shift Operator is=");
			  int y=50;
			  System.out.println(y>>2);
			  System.out.println(y>>3);
			
		}
		  public void bitwise(int m,int n, int o,int p) {
			  this.m=m;
			  this.n=n;
			  this.o=o;
			  this.p=p;
			  System.out.println("Bitwise Operator is=");
			  System.out.println(m>o & o<p);
			  System.out.println(n>p & o<p);
			  
		  }
		     All_Operator(int m1,int n1, int o1,int p1){  //Parameterized Constructor
			  m=m1;
			  n=n1;
			  o=o1;
			  p=p1;  
		     }
		  public void logical() {
			  System.out.println("Logical operator is=");
			  System.out.println(m>o && o<p);
			  System.out.println(n>p && o<p);
		  }
		  
		  public static void main(String args[]) {
				unary();  //Static Method Call
			    All_Operator al=new All_Operator(11,22,33,44);
				al.arithmatic();  // Non static MEthod call
				 leftshift();
				 al.rightshift(10, 20);  // Non static method with argument
				 al.bitwise(1, 2, 3, 4); // /Non static method with argument using this keyword
			   //All_Operator la= new All_Operator();
				 al.logical();
	  }
	}


