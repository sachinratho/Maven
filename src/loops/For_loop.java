package loops;

public class For_loop {

	public static void main(String [] args ) {
		For_loop v= new For_loop();
		v.practice();
		v.practice1();
	}

	public void practice() {
		int i;
		for(i=0; i<=10;i++) {

			System.out.println(i);

		}
	}

	public void practice1() {
		for(int k=10; k>=0; k--) {    // for reverse execution

			System.out.println(k);

		}


	}

}
