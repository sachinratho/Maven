package types_ofconstructors;

public class Consructors1 {

	String name;
	int age;
	float marks;


	Consructors1(){

		name="SACHIN";
		age=25;
		marks=344; 
		System.out.println("this zero line argument");
		System.out.println(name);
		System.out.println(age);
		System.out.println(marks);

	}

	Consructors1(int a){
		name="nilesh";
		age= 27;
		marks=388;
		System.out.println("this one line argument");
		System.out.println(name);
		System.out.println(age);
		System.out.println(marks);




	}

	Consructors1(int a,long b){
		name="roshan";
		age=22;
		marks=322;
		System.out.println("this two line  argument");
		System.out.println(name);
		System.out.println(age);
		System.out.println(marks);



	}
	Consructors1(String a,int b,long c){
		name="abhishek";
		age=22;
		marks=355;

		System.out.println("this is three line argument");
		System.out.println(name);
		System.out.println(age);
		System.out.println(marks);
	}



	public static void main (String[]args) {
		new	Consructors1();
		new Consructors1(321244444);
		new Consructors1 (255,355);
		new Consructors1("i love you java",25,55);
	}
}
