package standardprogram;

public class Groupc {
	String name;
	String degree;
	double fees;
	String training;

	public Groupc(String name,
			String degree,
			double fees,
			String training){

		this.name=name;
		this.degree=degree;
		this.fees=fees;
		this.training=training;   

	} 
	public void askcall() {
		System.out.println(name + "\n" + degree+ "\n"+ 21000 +"\n" +training);
	}


	public static void main(String []args) {
		Groupc t= new Groupc("sachin","mechanical",21000,"software testing");
		t.askcall();
		Groupc s= new Groupc("sagar","computer",21000,"software testing");
		s.askcall();
		Groupc q= new Groupc("ram","electronics",21000,"software testing");
		q.askcall();
		Groupc c= new Groupc("sachin","mechanical",21000,"software testing");
		c.askcall();
	}



}


