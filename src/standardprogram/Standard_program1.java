package standardprogram;

public class Standard_program1 {


	int r;//variable declaration
	String w;//variable declaration 


	// initialization (constructor)
	public Standard_program1() {

		r=4500;
		w="5600";


	}

	//usage

	public void add() {

		System.out.println(r+w);


	}

	public static void main(String [] args) {

		Standard_program1 t= new Standard_program1();
		t.add();
	}
}