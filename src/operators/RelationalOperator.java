package operators;

public class RelationalOperator {
	public void relational() {
		int x=450;
		int y=650;
		int z=100;
		int a= 650;
		System.out.println(x>y);//false
		System.out.println(x<y);//true  
		System.out.println(a<=y);//true
		System.out.println(a==y);//true
		System.out.println(a!=y);//false

	}
	public static void main (String []args) {
		RelationalOperator t= new RelationalOperator();
		t.relational();
	}

}
