package conditionalStatements;

public class NestedIfStatement {

	public void nested() {

		int f=50;

		if(f<100) {


			if(f>=50) {

				System.out.println("you have entered value between 50to 100");

			}
		}
	}

	public void iff2() {



		int marks =39;

		if(marks<40) {
			System.out.println("you have fail smoothly");	
		}
	}


	public static void main  (String []args) {
		NestedIfStatement t =new NestedIfStatement();
		t.nested();
		t.iff2();
	}




}


