package standardprogram;

public class Standardprogram3 {

	int name;
	float age;
	String sirname;

	Standardprogram3(){

		name= 25;
		age=25;
		sirname="rathod";
		System.out.println("this is zero line argument");
		System.out.println(name);
		System.out.println(age);
		System.out.println(sirname);


	}
	Standardprogram3(int a,float b,String c,long d){

		name=11;
		age=26;
		sirname="rathod 1";

		System.out.println("this is four line argument");
		System.out.println(name);
		System.out.println(age);
		System.out.println(sirname);

	}

	public static void main (String []args ) {
		new Standardprogram3();
		new Standardprogram3(22,22.22f,"calling you",2424524242l);
	}
}
