package input_from_user;

import java.util.Scanner;





public class Input_input {

	public static void main(String [] args) {
		Scanner w = new Scanner(System.in);

		System.out.println("ENTER YOUR FULL NAME ");
		String fullname = w.nextLine();
		System.out.println("your fullname is= " +fullname);
		System.out.println("enter your age");
		int t =w.nextInt();
		System.out.println("your age is ="+ t);
		System.out.println("your quallification");
		String degree =w.nextLine();
		System.out.println("your quallification is = " + degree);
		System.out.println("ENTER YOUR PASSOUT YEAR ");
		int a = w.nextInt();
		System.out.println("your passout year is = " + a);
		System.out.println(" eneter your percentage ");
		double b= w.nextDouble();
		System.out.println("your percentage is =" + b);
		System.out.println("enter your class of degree");
		double c = w.nextDouble();
		System.out.println("your degree of class is =" + c);
		System.out.println("enter your marks subject wise");
		int s=w.nextInt();
		System.out.println("your marks in maths=" + s);
		System.out.println("marks of drawing ");
		int y = w.nextInt();
		System.out.println("your drawings marks is =" + y);



	}

}
