package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
  public class LIveIframeHandeling {
  public static void main (String [] args ) throws InterruptedException{
  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
WebDriver d = new ChromeDriver();
d.manage().window().maximize();
d.manage().deleteAllCookies();
d.navigate().to("http://demo.guru99.com/test/guru99home/");
d.switchTo().frame("a077aa5e");
Thread.sleep(2000);
  JavascriptExecutor j=((JavascriptExecutor)d);
  j.executeScript("scroll(0,1200)");
d.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();


String parentid = d.getWindowHandle();
System.out.println("this is parent id ="+parentid);
Set<String> childid = d.getWindowHandles();
System.out.println("this is childid ="+childid);
for(String s: childid) {
	if(!parentid.equals(s)) {
		d.switchTo().window(s);
		d.findElement(By.xpath("//input[@class='text']")).sendKeys("sachin@993");
	}
  
d.switchTo().window(parentid);
Thread.sleep(2000);
j.executeScript("scroll(0,-2400)");



	}
	
  }}	


