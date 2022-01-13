package abstracttion;

public   abstract  class PersionalDEtails {

	public void  accountopen() {
		
		System.out.println(" i want to open an account in bank");
	}
	
        abstract public   void main();
        abstract public void adharno();
        abstract  public void mobileno();
        abstract public void panno();

        public void accountCreated() {
		
		System.out.println(" account created in bank");
	}
        
        public void mtd() {
        	System.out.println(" upcasting");
        }
}
