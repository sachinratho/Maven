package seleniumfirefoxpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FIREFOXLaunch {
	
	public static void main (String [] args ) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\firefox\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	}

}
