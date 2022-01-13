package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitelyWaitwithIsselected {
	public static void main (String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("https://paytm.com/recharge");   
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//For isselected method 
		
//		WebElement postpaid  = d.findElement(By.xpath("/input[@value='postpaid']"));
//		boolean res = postpaid.isSelected();           
//		if (res==true) {
//			
// 		System.out.println("test scenario is passed");
//		}
//		else
//		{
//		
//		System.out.println("scenario is failed");
		WebElement postpaid = d.findElement(By.xpath("/input[@value='postpaid']"));
		postpaid.click();
	}
	
	
	
	

}
}