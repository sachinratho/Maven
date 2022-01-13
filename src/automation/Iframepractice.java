package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframepractice {
	public static void main (String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("http://demo.guru99.com/test/guru99home/");//main page

		JavascriptExecutor	j=(( JavascriptExecutor)d);
		j.executeScript("scroll(0,400)");
		d.switchTo().frame("a077aa5e");// focus change to iframe                                     // main page
		d.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();//i frame 
		Thread.sleep(2000);
		d.switchTo().defaultContent();
		
		
		//iframe 1  //switchto().frame(0);
		// d.findElement(By.xpath("//input[@class='text']")).sendKeys("sachin@123");                  // iframe2 //switchto().frame(1);
		String parentid = d.getWindowHandle();                                                         //iframe3//switchto().frame(2);
		System.out.println("this is parent id"+parentid);
		Set<String> childid = d.getWindowHandles();                                                   //default content
		System.out.println("this is parent id"+childid);                                                 //switch to().parentFrame();
		for(String s: childid) {
			if(!parentid.equals(s)) {//!parent id ==parent id = false

				//!parentid ==childid= true


				d.switchTo().window(s);

				d.findElement(By.xpath("//input[@class='text']")).sendKeys("sachin@123");
				Thread.sleep(2000);
				// d.close();
			}
		}
		d.switchTo().window(parentid);

	}
}
