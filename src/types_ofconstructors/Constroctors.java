package types_ofconstructors;

public class Constroctors {

	String name;
	String bloodgroup;
	int height;
	
	Constroctors(){
		name="sachin";
		bloodgroup="A+";
		height=165;
		System.out.println(name);
		System.out.println(bloodgroup);
		System.out.println(height);
		System.out.println("this is non argument");
	}
	Constroctors(int a){
		name="nilesh";
		bloodgroup="A+";
		height=165;
		System.out.println(name);
		System.out.println(bloodgroup);
		System.out.println(height);

		System.out.println("this is parameterised");


	}

	Constroctors (int a,int b){
		name="gajanan";
		bloodgroup="B+";
		height=164;
		System.out.println(name);
		System.out.println(bloodgroup);
		System.out.println(height);
		System.out.println("this is two parameter");





	}

	Constroctors(int a, float b){
		name ="Hitesh";
		bloodgroup="a+";
		System.out.println("this is two parameter");
		System.out.println(name);
		System.out.println(bloodgroup);
		System.out.println(height);

	}

	
	

	public static void main(String []args ) {
		new Constroctors();
		new Constroctors(45);
		new Constroctors(45,25);
		new Constroctors(1,11.11f);

	}

}
