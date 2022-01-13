package input_from_user;

import java.util.Scanner;

public class Trial_on_scannerclass {
	
	int a;
	int b;
	
	public void check(int a,  int b ) {
		
		if (a>b) {
			System.out.println("the value is greater than zero");
		}
		else if (a<b) {
			System.out.println("the value is less than zero");
		}
		else {
			System.out.println("the value is null ");
		}
	}
	
	public static void main (String [] args ) {
		Scanner w= new Scanner (System.in);
		  System.out.println("enter your value of a ");
		  int a =w.nextInt();
		  System.out.println("enter your value of b ");
		  int b= w.nextInt();
		  
		  Trial_on_scannerclass t = new Trial_on_scannerclass();
		  t.check(a,b);
		  w.close();
	}

}
