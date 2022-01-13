package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
	
	public void locate() {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("file:///D:/notepad/mypage.html");
	
		//locator 1: TAGNAME 
		//WebElement un = driver.findElement(By.tagName("input"));
		//un.sendKeys("fisrt timme automating the browser");
		
		
		WebElement bn = driver.findElement(By.tagName("input"));
		bn.sendKeys("password");
	}
	public static void main (String [] args ) {
		Locator1 r= new Locator1();
		r.locate();
	}

}
