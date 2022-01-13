package specialprograms;

public class PrimeNumbers {
	
	public void PNorNT() {
		
		int no=9;
		int temp = 0;
		//check no is prime or not
		
		for(int i=2; i<=no-1;i++) {
			
			if(no%i==0) {
				temp=temp+1;
			}
		}
		
		if(temp>0) {
			System.out.println("this is not a prime number");
		}
		else {
			System.out.println("this is a prime number");
		}
	}
	public static void main (String [] args ) {
		PrimeNumbers u = new PrimeNumbers ();
		u.PNorNT();
	}

}
