package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionPoint {

	public static void main (String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.manage().window().maximize();
		
		d.navigate().to("https://www.facebook.com/");
		
		Dimension dm = new Dimension(900, 400);
		
		d.manage().window().setSize(dm);
		
		Thread.sleep(5000);
		
		Point p = new Point(300, 500);
		
		d.manage().window().setPosition(p);
		
		Thread.sleep(5000);

		//
		//		Dimension ok = new Dimension(900,400);
		//		d.manage().window().setSize(ok);
		//		
		//	Thread.sleep(2000);
		//		Point bk = new Point(300,200);
		//		d.manage().window().setPosition(bk);
		//
		//		Thread.sleep(2000);
		//		
		//		WebElement un = d.findElement(By.id("email"));
		//        un.sendKeys("9158683662");
		//        WebElement bn = d.findElement(By.id("pass"));
		//        bn.sendKeys("ilovemyself2");
		//        WebElement nn = d.findElement(By.name("login"));
		//        nn.click();
		//        
		//        d.manage().window().maximize();
		//        
	}

}
