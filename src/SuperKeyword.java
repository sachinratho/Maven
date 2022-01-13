
public class SuperKeyword extends ThiskeyWord {
	
	int a;    
	int b;                      
	 public void superkeyword ( int a, int b) {  
		 
		        this.a=a;
		        this.b=b;
		 System.out.println(a);                  
		 System.out.println(b);                              
		 System.out.println(this.a);                 
		 System.out.println(this .b);                  
		 System.out.println(super.a);               
		 System.out.println(super.b);


	 }
	 public static void main (String args []) {
		 SuperKeyword n = new SuperKeyword();
		 n.superkeyword( 200,300);
	 }

}
