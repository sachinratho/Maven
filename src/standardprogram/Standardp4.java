package standardprogram;

public class Standardp4 {

	String name ;
	double fee;
	String training;

	Standardp4(String name,double fee,String training){

		this.name =name;
		this.fee=fee;
		this.training=training;

	}

	public void call(){
		System.out.println(name+"\n"+fee+"\n"+training);


	}

	public static void main(String[]args) {
		Standardp4 t= new Standardp4("Sachin",21000,"software testing");
		t.call();
		Standardp4 s= new Standardp4("sagar",21000,"software testing");
		s.call();
		Standardp4 c= new Standardp4("chandrakant",21000,"software testing");
		c.call();
		Standardp4 r= new Standardp4("ram",21000,"software testing");
		r.call();
	}

}


