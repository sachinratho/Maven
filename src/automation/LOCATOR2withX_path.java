package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LOCATOR2withX_path {
	
	void xpathnew() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.navigate().to("file:///D:/notepad/velocity.html");
		d.manage().window().maximize();
		// X-PATH----PART1
		//absolute X_PATH -normal/regular ----STD SntX------/tagname/tagname/tagname
		
	         WebElement un = d.findElement(By.xpath("/html/body/div/input") );
	           un.sendKeys("sachin@123");
	
	//X-PATH ---PART2
	// Absolute X-PATH by index   STD stx ------/tagname/tagname[index] 
      WebElement ab = d.findElement(By.xpath("/html/body/div/input[2]"));
	   ab.sendKeys("sachin@121");
	   
	   //x-path ---part3
	   //Absolute x-path by index using signature 
	   //Std .Syntax------(	X-PATH)[INDEX]
	   
  WebElement aa = d.findElement(By.xpath("(/html/body/div/input)[7]"));
	aa.click();
	}
public static void main (String [] args ) {
	LOCATOR2withX_path n = new LOCATOR2withX_path ();
	n.xpathnew();
}
}
