package star_pattern;



public class Star1 {
	public static void main(String []args) {
		Star1 v= new Star1();
		v.str1();
	}

	public void str1() {
		int t=6;
		for (int i =1; i<=t;i++ ) {
			for (int j =t; j>=i;j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
