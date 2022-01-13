package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOUSEvoERActions {
	
	public void MHA() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		d.navigate().to("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
	WebElement t = d.findElement(By.xpath("//button[text()='Automation Tools']"));
	//t.click();
	Actions a= new Actions(d);
	a.moveToElement(t).perform();
	List<WebElement> opt = d.findElements(By.xpath("//div[@class='dropdown-content']/a"));
	int count =opt.size();
	System.out.println("OPtions are="+count);
	for (int i=0; i<count ; i++) {
    WebElement f = opt.get(i);
    String r = f.getAttribute("innerHTML");
    System.out.println(r);
     if (r.equalsIgnoreCase("selenium")) {
	 f.click();
	 
 }
	}
	
	
	}
	public static void main (String [] args ) {
		MOUSEvoERActions b = new MOUSEvoERActions ();
		b.MHA();
	}

}
