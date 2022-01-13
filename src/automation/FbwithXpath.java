package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbwithXpath {
	
	public void xpath() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d  =new ChromeDriver();
		d.navigate().to("https://www.facebook.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath(null));
	
	}
	
	public static void main (String [] args ) {
		FbwithXpath u = new FbwithXpath();
		u.xpath();
		
	}

}
