package automation;

public class VERIFYURLandTITTLE extends BrowserLaunch {
	String expurl ="https://www.facebook.com/";
String	 exptittle= " Sign up for Facebook|facebook";
	
	public static void main (String [] args) {
		VERIFYURLandTITTLE r= new VERIFYURLandTITTLE();
		r.StratBrowser();
		r.launchChromeBrowser();
		d.get("https://www.facebook.com/");
		
      	r.verifyURL();
		r.verifytittle();
	
	}
	
	void verifyURL() {
	System.out.println(" your scenario started");
		String actURL= d.getCurrentUrl();
		System.out.println("this is actual url"+ actURL);
		
		if (expurl.equals(actURL)) {
	System.out.println("this is actual url = " + actURL);
		System.out.println(" this scenario is completed");
		System.out.println(" this is actual scenario");
	}	
		else {
		System.out.println("this is not actual url");
		
		
	}
		
	//	String acttittle=d.getTitle();
	//	System.out.println("this is tittle "+acttittle);
	
}
	
	void verifytittle() {
		
		System.out.println(" trying to get tittle");
		String acttittle=d.getTitle();
		if(acttittle.equals(exptittle)) {
			System.out.println("this is actual tittle ="+acttittle );
			System.out.println(" scenario completed");
		}else
		{
			System.out.println("this is wrong tittle ");
		}
		
		
	}

	}



	
	
