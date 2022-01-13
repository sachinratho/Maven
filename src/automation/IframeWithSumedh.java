package automation;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeWithSumedh {
	 public static void main (String [] args ) throws InterruptedException{
		  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("http://demo.guru99.com/test/guru99home/");
	//	d.switchTo().frame(0);
//		JavascriptExecutor j = ((JavascriptExecutor)d);
//		
//		j.executeScript("scroll(0, 2000)");
//	d.switchTo().frame("a077aa5e");
//	
//		d.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
////		d.switchTo().frame("a077aa5e");
////		Thread.sleep(2000);
////		  JavascriptExecutor j=((JavascriptExecutor)d);
////		  j.executeScript("scroll(0,1200)");
//	//	TakesScreenshot ss = ((TakesScreenshot)d);
//	//	 File f = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);

}}
