package practice1;

public class mixmtdclargs {
	public void area() {
	
	float side =20;
	float result=side+side;
	System.out.println(result);
	}
	
	public void area(int love ) {
		
		int result = love *love;
		
		System.out.println(result);
		
		
	}
	
	public void area(double a,double b) {
		
		double print = a+b;
		System.out.println(print);
		
		
	}
	public static void main (String []args) {
		mixmtdclargs f=new mixmtdclargs();
		f.area();
		f.area(20);
		
		f.area(200,200);
		
		mtdclargs t=new mtdclargs();
		t.velocity(41,44);
	}
	
	
	
	

}
