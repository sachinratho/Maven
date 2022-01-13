package oppspractice;

public class ENcapsulatION {
private 	 double balence;
	String name;

	double getbalence() {
		return balence;
		//System.out.println(balence);
	}
	public String getname() {
		return name;
	}
	public void setbalence(double balence) {
	this.balence=balence;
	}
	public void setname(String name) {
	this.	name=name;
	}

	public static void main (String args[]) {
		ENcapsulatION t= new ENcapsulatION();

		t.setbalence(10000 );
		t.setname("SACHIN");
		t.getname();
		t.getbalence();
		System.out.println(t.getbalence());
		System.out.println(t.	getname());
		
	}

}
