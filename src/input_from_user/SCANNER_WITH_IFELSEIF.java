package input_from_user;

import java.util.Scanner;

public class SCANNER_WITH_IFELSEIF {
	
	public static void main (String [] args) {
		
		Scanner obj = new Scanner (System.in);
		System.out.println("ENTER YOUR HEIGHT");
		 int height = obj.nextInt();
		 System.out.println("your height is = " + height);
		 obj.close();
	
		if (height>167) {
			
			System.out.println("your height is =" + height);
			
		}
		else if (height <167) {
			
			System.out.println("you are eligible for army");
			System.out.println("ABHI MAJA AYEGA NA BHIDU");
		}
		else {
			System.out.println("here i close the  else");
		}
		
	}

}
