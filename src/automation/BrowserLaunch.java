package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch implements CommenProperties {

	static WebDriver d;
	public void StratBrowser() {
		System.out.println(" your fevorite browser started");

	}


	public void launchChromeBrowser() {
		System.setProperty(key1, value1);
		d=new ChromeDriver();
		//d.get("https://www.facebook.com/");
//			d.get("https:en-gb.facebook.com/r.php");
	}


	public void launchfirefoxBrowser() {
		System.setProperty(key2, value2);
		d= new FirefoxDriver();
		d.get("https:en-gb.facebook.com/r.php");
	}


	public void endBrowser() {
		d.close();
		System.out.println(" your fevorite browser closed");
	}

}
