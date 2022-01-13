
public class ENCAPTEST {
	
 private double balence;

public double getbalence() {
	return balence;
}
public void setbalence(double balence1) {
	balence=balence1;
}

public static void main (String args[]) {
	ENCAPTEST t= new ENCAPTEST();

	t.setbalence(10000);
	double mybalence=t.getbalence();
	System.out.println(mybalence);
	
	
}

}
