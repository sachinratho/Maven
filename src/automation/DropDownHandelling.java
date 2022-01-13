package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandelling {
	public static void main (String [] args ) {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		d.navigate().to("https://www.facebook.com/signup");
		WebElement day = 	d.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(day);
		s.selectByIndex(18);
		WebElement month = d.findElement(By.xpath("//select[@id='month']"));
		Select m = new Select(month);
		m.selectByVisibleText("Mar");
		WebElement year = d.findElement(By.xpath("//select[@id='year']"));
		Select e = new Select(year);
		e.selectByValue("1996");
		List<WebElement> options = e.getOptions();
		int count = options.size();
		System.out.println("options are = "+count);

		for(int i =0; i<count; i++) {
			String text = options.get(i).getText();
			System.out.println(text);
		}

	}}

