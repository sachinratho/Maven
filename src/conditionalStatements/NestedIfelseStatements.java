package conditionalStatements;

public class NestedIfelseStatements {

	public static  void main (String []args) {
		NestedIfelseStatements t = new NestedIfelseStatements();
		t.shweta();
	}

	public void shweta () {

		String username = "Shweta143";
		String password= "@143ILu";
		if (username=="Shweta143") {	
			if (password=="@143ILu") {
				System.out.println("user logged in sucessfully");
			}else {
				System.out.println("you have entered invalid password");
			}
		}else {
			System.out.println("you have entered invalid yousername and password");
		}

	}
}		

