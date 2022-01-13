package automation;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimensionandpointclass {

	public static void main (String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.facebook.com/");
		Dimension dm = new Dimension(900, 400);
		d.manage().window().setSize(dm);
		Point p = new Point(400,500);
        d.manage().window().setPosition(p);
        

}
}