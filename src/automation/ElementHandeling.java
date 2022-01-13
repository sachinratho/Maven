package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementHandeling {

	
	public void WH() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("file:///D:/VelocityTraining/Official%20Velocity/Aug%2021%20Evening/Aug21Eve_Gang.html");
		
		
	}
	public static void main (String [] args) {
		ElementHandeling b = new ElementHandeling();
		b.WH();
		
	}
}
