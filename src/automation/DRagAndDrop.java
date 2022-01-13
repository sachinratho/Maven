package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DRagAndDrop {
	public static void main (String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		d.navigate().to("https://jqueryui.com/droppable/");
		d.switchTo().frame(0);
		WebElement ele1 = d.findElement(By.xpath("//div[@id='draggable']"));
		WebElement ele2 = d.findElement(By.xpath("//div[@id='droppable']"));
		Actions a= new Actions(d);
		//a.clickAndHold(ele1).moveToElement(ele2).release().build().perform();
	a.dragAndDrop(ele1, ele2).perform();
//	d.switchTo().parentFrame();
	d.switchTo().defaultContent();
	WebElement g = d.findElement(By.xpath(("//a[@href='/']")));
	//a.click(g);
	a.contextClick(g).perform();
	//WebElement D = d.findElement(By.xpath("//div[@id='logo-events']"));
	//a.click(D).perform();
	//a.contextClick(D);
//	System.out.println("script ok");
//	
	
	}

}
