package seleniumfirefoxpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeAGainLAUNCH {
	
	public static void main (String [] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	
	System.setProperty("webdriver.gecko.driver", "D:\\firefox\\geckodriver.exe");
	WebDriver driver1= new FirefoxDriver();
	}
																																																																																																																																			
}
