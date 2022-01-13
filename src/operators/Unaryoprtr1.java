package operators;

public class Unaryoprtr1 {



	public void oprtr() {
		int d=10;
		System.out.println(d);//d=10
		System.out.println(d++);//d=10 bcz late fix ,(++=1)
		System.out.println(d);  // it will fix here d=11
		System.out.println(d++);//11
		System.out.println(d);  //12
	}

	public void oprtr1() {
		int e=100;
		System.out.println(e);//100
		System.out.println(e--);//100-1=99
		System.out.println(e);//99
		System.out.println(e--);//99
		System.out.println(e);//88



	}

	public void oprtr2() {
		int a=12;
		System.out.println(a);//12
		System.out.println(++a);//13
		System.out.println(a);//13
		System.out.println(++a);//14
	}

	public void oprtr3() {
		int a=33;
		System.out.println(a);//33
		System.out.println(--a);//32
		System.out.println(a);//32
		System.out.println(--a);//31
	}
	public void oprtr4() {
		//for negetive sign or positive sign
		int s=122;
		System.out.println(-s);//-122
	}
	public void oprtr5() {
		//for inverse symbol
		int y= 700;
		System.out.println(~y);//-701

		int p=898;
		System.out.println(~p);//-899

		int q=-158;
		System.out.println(~q);//157




	}
	public void oprtr6() {
		// its vakil operator 

		boolean b= true;
		System.out.println(!b);
	}

	public static void main(String []args) {
		Unaryoprtr1 u=new Unaryoprtr1();

		u.oprtr();
		u.oprtr1();
		u.oprtr2();
		u.oprtr3();
		u.oprtr4();
		u.oprtr5();
		u.oprtr6();
	}
}



