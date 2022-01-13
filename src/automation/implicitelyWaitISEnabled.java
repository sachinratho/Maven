package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitelyWaitISEnabled {
public static void main (String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("https://www.facebook.com/reg/");
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//For isEnabled method
		WebElement firstname = d.findElement(By.xpath("//input[@name='firstname']"));
		boolean enb = firstname.isEnabled();
		
		if(enb==true) {
			System.out.println("scenario is passed");
		}
		else 
		{
			System.out.println("scenario is failed");
		}
}}
