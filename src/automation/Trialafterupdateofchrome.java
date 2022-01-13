package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trialafterupdateofchrome {
public static void main (String [] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().deleteAllCookies();
		d.manage().window().maximize();
		d.navigate().to("https://jqueryui.com/droppable/");

}}
