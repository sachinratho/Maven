package loGIcal_program;

public class Prime_Number {

	public static void main (String args []){
		int no = 8;
		int count =0;
		for(int i = 2; i<=no-1; i++)
		{
			if(no%i == 0)
			{
				count = count+1;
			}
		}
		if(count>0)
		{
			System.out.println("no is not prime " );
		}
		else
		{
			System.out.println("no is prime ");
		}
	}

}
