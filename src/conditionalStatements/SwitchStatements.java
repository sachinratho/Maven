package conditionalStatements;

public class SwitchStatements {
	public static void main(String []args) {
		SwitchStatements t =new SwitchStatements();
		t.statement();
	}	
	public void statement() {
		String day = "G";
		switch (day){
		case "a" :
			System.out.println("monday");break;
		case "b" :
			System.out.println("tuesday");break;
		case "c" :
			System.out.println("wednesday");break;
		case "d" :
			System.out.println("thursday");break;
		case "e" :
			System.out.println("friday");break;
		case "f" :
			System.out.println("saturday");break;
		case "G":
			System.out.println("sunday");break;

		default: System.out.println("noday");break;
		}

	}
}


