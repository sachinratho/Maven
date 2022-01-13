package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFACEBOOK {
	
	void fB() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("9158683662");
	driver.findElement(By.id("pass")).sendKeys("ilovemyself2");
    driver.findElement(By.name("login")).click();
//	driver.manage().window().maximize();
	//driver.navigate().to("https://www.youtube.com/");
//	driver.findElement(By.name("search_query")).sendKeys("mai balak tu mata");
	//driver.findElement(By.id("pass")).sendKeys("ilovemyself2");
	//driver.findElement(By.tagName("style-scope ytd-searchbox")).click();
  Thread.sleep(4000);
    driver.close();
	
	}
	
	public static void main (String [] args ) throws InterruptedException {
		LaunchFACEBOOK r=new LaunchFACEBOOK();
		r.fB();
		
	}

}
