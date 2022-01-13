package star_pattern;

public class BUTTERFLY_PATTERN {
	
	public static void main (String [] args) {
		
		BUTTERFLY_PATTERN v= new BUTTERFLY_PATTERN();
		v.practice();
		//v.practice1();
		}
	public void practice () {
		
		
		for (int i =1 ; i<=5; i++) {
			for (int j =1 ; j<=i; j++) {
				
				System.out.print(" * ");
			} 
			System.out.println();
		}
		
		for(int i = 1 ; i<=5; i++) {
			for (int j = 5; j>=i; j--) {
				System.out.print(" * ");
			} System.out.println();
		}
for (int i = 1; i<=5; i++) {
			
			for (int j= 4; j>=i;j--) {
				System.out.print("  ");
			}
			
			for (int k= 1; k<=i; k++) {
			
		System.out.print(" * ");
		
			
	}
			System.out.println();
	
	
}


for (int i=1; i<=5; i++) {
	for(int j=1; j<=i; j++) {
		System.out.print("  ");
	}
	for(int k = 5; k>=i; k--) {
		System.out.print(" * ");
	}
	System.out.println();
}
	}
	
//	public void practice1() {
	
}	
	
