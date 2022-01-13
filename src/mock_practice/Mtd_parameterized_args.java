package mock_practice;

public class Mtd_parameterized_args {
	public void groupC() {
		float side =44;
		float value =55;
		System.out.println(side+ value);
	}
	
	public void groupC(float a,float b) {
		float result =a+b;
		System.out.println(result);
	}
	public static void main (String []args) {
		Mtd_parameterized_args Q= new Mtd_parameterized_args();
		Q.groupC();
		Q.groupC(88,99);
	
	}

}
