package polymerphism1;

public class CompiletimePolymerphism {

	public void areaofcircle(int r1) {
		double d = r1*r1*3.14;
		System.out.println("area of one circle ="+ d);
	}
	public void areaofcircle(int r2 ,int r3) {

		int r= r3-r2;
		double d=r*r*3.14;
		System.out.println("area of two circle = "+ d);
	}

	public static void main (String [] args ) {
		CompiletimePolymerphism obj = new CompiletimePolymerphism();
		obj.areaofcircle(10);
		obj.areaofcircle(13, 12);
	}

}
