package input_from_user;

import java.util.Scanner;

public class Scanner_in_SWITCH {

	public static void main (String [] args ) {

		Scanner w = new Scanner (System.in);
		System.out.println("Enter your day");
		int day= w.nextInt();

		switch (day ) {

		case 1 : System.out.println("monday");break;


		case 2 : System.out.println("friday");break;

		case 3 : System.out.println("sunday");break;

		default: System.out.println("noday");break;
		}

	}
}