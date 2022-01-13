package birthday_wish;

public class HAPPY_BIRTHDAY_NANDU {

	String birthday;
	int date;

	HAPPY_BIRTHDAY_NANDU(String birthday,int date){

		this.birthday=birthday;
		this.date=date;

	}
	public void wishesh() {
		System.out.println(birthday+"\n"+date);

	}
	public static void main (String []args) {
		HAPPY_BIRTHDAY_NANDU W=new HAPPY_BIRTHDAY_NANDU("HAPPY_BIRTHDAY",0);
		W.wishesh();
	}



}
