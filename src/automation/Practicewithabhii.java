package automation;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicewithabhii {

	public static void main (String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.google.com/webhp");
	WebElement b = d.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
b.sendKeys("pune");
   // WebElement u = d.findElement(By.xpath("//input[@class='gNO89b'])[1]"));
//u.click();
    b.submit();

    File SS = (( TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
   String saveto = "D:\\AUTOMATION SCreenShot\\defect1.png";
   File f= new File(saveto);
   FileHandler(SS,f);
    Dimension n = new Dimension(600,500);
    d.manage().window().setSize(n);
    Point p = new Point(400,500);
    d.manage().window().setPosition(p);

                  

}

	private static void FileHandler(File sS, File f) {
		// TODO Auto-generated method stub
		
	}
}