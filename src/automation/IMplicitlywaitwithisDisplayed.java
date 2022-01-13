package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IMplicitlywaitwithisDisplayed {
	
public static void main (String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("https://www.facebook.com/");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//For isDisplayed method
	WebElement fblogo = d.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
    boolean disp = fblogo.isDisplayed();
    if (disp==true) {
    	System.out.println("test scenario is passed");
    }
    else 
    {
    	System.out.println("test scenario is failed");
    }
}}
