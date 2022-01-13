package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator2 {
	
	public void loc2() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("file:///D:/notepad/velocity.html");
		//1.TAGNAME
		WebElement un = d.findElement(By.tagName("input"));
		un.sendKeys("sachin@993");
		//2.Id
		WebElement us = d.findElement(By.id("email77"));
		us.sendKeys("sachin.rathod993@gmail.com");
		//3.name
		WebElement sa = d.findElement(By.name("radiobutton1"));
		sa.click();
		//4.Classname
		WebElement o = d.findElement(By.className("c11"));
		o.click();
		//5.link text
		WebElement a = d.findElement(By.linkText("Forgotton Account?"));
		a.click();
		//6.partial link
		WebElement q = d.findElement(By.partialLinkText("rgotton Account?"));
		q.click();
		
		
	      d.quit();
		
		
		
	}
	public static void main (String [] args ) {
		Locator2 d = new Locator2() ;
		d.loc2();
		
		
	}

}
