package star_pattern;

public class Star1_1 {

	public static void main (String [] args) {
		for (int i=1; i<=6;i++) {
			for (int j=1; j<=i;j++) {

				System.out.print(" * ");

			}
			System.out.println();
		}

		for (int i =1; i<=6; i++) {

			for (int j =5; j>=i; j--) {

				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}

