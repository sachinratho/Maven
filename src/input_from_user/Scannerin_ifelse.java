package input_from_user;

import java.util.Scanner;

public class Scannerin_ifelse {

	
	
	public static void main (String [ ] args ) {
		
		Scanner w = new Scanner (System.in);
		System.out.println("enter your marks");
		int marks = w.nextInt();
		
		Scannerin_ifelse n = new Scannerin_ifelse ();
		n.trial1();
		
		if (marks>60)
		 {
			
			System.out.println(" you are passed");
		}
		else {
			System.out.println("you are smoothly fail");
		}
		
		
		
	}
	
	public void trial1() {
		Scanner n = new Scanner(System.in);
		
		System.out.println("enter your age");
		int age = n.nextInt();
		if(age <60) {
			
			System.out.println("you are elligible for pension");
			
			
			
		}
		else {
			System.out.println("you are not elligible for pension");
		}
		
	}
}
