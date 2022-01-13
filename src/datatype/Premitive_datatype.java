package datatype;

public class Premitive_datatype {

	public static void main (String [] args) {

		Premitive_datatype R = new Premitive_datatype ();
		R.EX1();
		R.EX2();
		R.EX3();
		R.EX4();
		R.EX5();
		R.EX6();
		R.EX7();
	}

	public void EX1() {

		boolean A = 99>1;
		System.out.println(A);

		//USE ONLY FOR CONDITIONAL DATA.
		//ONLY FOR TRUE OR FALSE CONDITION.
		//SIZE 1 BIT 

	}

	public void EX2() {

		byte B = -128;
		System.out.println(B);			
		// USE TO STORE NUMERIC DATA 
		//default value 0, default size 1 byte
		//value range lies between -128 to 127
	}
	public void EX3() {

		short C = 32767;
		System.out.println(C);

		//use to store numeric value in a range -32768 to 32767
		// size 2 byte 
		// default value 0


	}

	public void EX4() {
		int D = 2147483647;
		System.out.println(D);

		// use to store numeric value in a range of -2147483647 to 2147483647
		// size -4 byte 
		// value -0

	} 

	public void EX5() {

		long E = 9999999999999l;
		System.out.println(E);

		// use to store numeric value  which is in range more than int.i.e (-2^63 to 2^63-1)
		// size 8 byte 
		// value 0l
		// in which no need to add suffix as "L" upto int. limit .

	}    

	public void EX6() {
		float F= 99.99f;
		System.out.println(F);
		// use to store fractional numeric value with unlimited range 
		// size -4 byte 
		// value - 0.0f
		// in which other than fractional value but less than no need to add suffix as "F"
	}
	public void EX7() {

		double G =1.22;
		System.out.println(G);

		//use to store fractional numeric value with unlimited range     
		// size -8 byte 
		// value -0.0d
		// in which no need to add sufixx as ""d" upto int. limit .


	}

}

