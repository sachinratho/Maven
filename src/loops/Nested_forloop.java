package loops;

public class Nested_forloop {

	public static void main (String [] args) {
		Nested_forloop v= new Nested_forloop();
		v.prctce();
	}

	public void prctce() {

		int i,j,k;

		for (i=0; i<=3; i++) {
			for (j=0; j<=3;j++){
				for (k=1; k<=4; k++) {

					System.out.println(i+ " "+ j+ " "+ k);
				}



			}
		}
	}

}
