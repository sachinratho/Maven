package automation;

public class Nevigatemethod extends  BrowserLaunch {
String link1 = "https://www.facebook.com/";
String link2 ="https://www.amazon.in/";
public 	void nevigatemtd() throws InterruptedException  {
		
		d.navigate().to(link1);
         Thread.sleep(5000);
		d.navigate().to(link2);	
		Thread.sleep(5000);
		d.navigate().back();
		Thread.sleep(5000);
		d.navigate().forward();
		Thread.sleep(5000);
		//d.navigate().refresh();
	}

public static void main (String [] args ) throws InterruptedException  {
	Nevigatemethod r= new Nevigatemethod();
	r.StratBrowser();
	r.launchChromeBrowser();
	r.nevigatemtd();
r.endBrowser();

	
	
}
}
