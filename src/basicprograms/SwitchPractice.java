package basicprograms;

public class SwitchPractice {

public void practice () {
	
	int marks =1;
	
	switch (marks) {
	
	case 1: 
		if (marks>70) {
		System.out.println( "marks is greater than 70");
		
		}
		else  {
			System.out.println("ypu have entered right value");
		}
	
}
		
	}

public void practice2() {
	String a=" holidays";
	
	switch ("holidays") {
	
	case "a": System.out.println("a==holidays");
		
		
	}
	
	
}
public static void main (String [  ] args) {
	SwitchPractice f = new SwitchPractice ();
f.	practice();
f.practice2();
	
}
	
}


