package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {
	static String	exptittle="Online Recharge - Online Mobile Recharge & Prepaid Recharge Plans";
	public static void main (String [] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		WebDriverWait w= new WebDriverWait(d,5); 
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("https://paytm.com/recharge"); 
		//	
		//		String  realttl = d.getTitle();
		//		System.out.println(realttl);
		//		if(exptittle.equals(realttl))
		//		{
		//			System.out.println("test scenario is passed");
		//		}
		//		else {
		//			System.out.println("test scenario is failed");
		//
		//		}
		//		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='user']"))).click();


		System.out.println("you have executed the test script successfully");
	}
}