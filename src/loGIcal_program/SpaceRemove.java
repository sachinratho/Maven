package loGIcal_program;

public class SpaceRemove {
	public static void main (String [ ]args) {
		String s1 = "   sachin  rathod  yavatmal     ";
		String ss = s1.replaceAll("\\s", "");
//		String str= s1.replaceAll("\\s", "");
		System.out.println(ss);
		System.out.println(s1);
	String sss = s1.trim();
	System.out.println(sss);
//	
	}

}
