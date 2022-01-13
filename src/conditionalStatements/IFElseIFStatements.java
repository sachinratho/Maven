package conditionalStatements;



public class IFElseIFStatements {

	//else if statement
	//else if else statements

	public static void main (String []args) {
		example();
	}

	public static void example() {
		int marks = 74;
		if (marks >65) {
			System.out.println("first class with distinction");
		}
		else if (marks>=60&&marks<65) {
			System.out.println("first class");
		}
		else if (marks >=55&&marks<60) {
			System.out.println("higher second class");
		}
		else if (marks>40&&marks<55) {
			System.out.println("second class");
		}
		else {
			System.out.println("you are little fail ");
		}
	}
}
