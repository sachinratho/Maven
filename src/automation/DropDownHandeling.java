package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandeling {
	public static void main (String [] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/signup");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(day);
		s.selectByIndex(9);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select ss = new Select(month);
		ss.selectByVisibleText("May"); 
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select sss = new Select(year);
		sss.selectByValue("1997");

	}

}
