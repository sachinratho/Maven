package find_numbers;

public class Even_numbers_odd_numbers {
	public static void main (String[]args) {
		Even_numbers_odd_numbers v = new Even_numbers_odd_numbers();
	v.evenno();
		v.oddno();
		
	}
	
	public void evenno() {
		
		for(int i=1500; i<=2000; i++) {
			
			if (i%2==0) {
				
				System.out.println( i);
			}
		}
		
	}
	
	public void oddno() {
		
		System.out.println("this is odd numbers");
		for(int i = 1500; i<=2000; i++) {
			if (i%2!=0) {
				System.out.println(i);
			}
		}
	}
	
			
			
		
	}


