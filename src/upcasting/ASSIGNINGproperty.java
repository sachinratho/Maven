package upcasting;

public class ASSIGNINGproperty    {

	public static void main (String [] args) {

		//UPCASTING

			PARENTCLASS B= new CHILDCLASS();
			B.car();
			B.house();
			B.land();
			
			// DOWNCASTING
			PARENTCLASS J= new CHILDCLASS();

		CHILDCLASS V=(CHILDCLASS)J;
		V.bike();
		V.job();
		V.house();
		V.land();



	}
}
