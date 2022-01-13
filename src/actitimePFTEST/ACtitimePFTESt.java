package actitimePFTEST;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actitimePF.ActitimeHomepage;
import actitimePF.ActitimeLOGINpage;

public class ACtitimePFTESt {
public  static void main (String [] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
	driver.manage().deleteAllCookies();
	
	driver.manage().window().maximize();
	driver.navigate().to("http://localhost/login.do");	
	
	ActitimeLOGINpage act= new ActitimeLOGINpage(driver);
	act.setActitimeloginpageusername();
	act.setActitimeloginpagepassword();
	act.setActitimeloginpageloginbutton();
	
	ActitimeHomepage act1= new ActitimeHomepage(driver);
	act1.verifyactimepagelogo();
	act1.actimepagelogoutbutton();
	
	System.out.println("scenario is passed");
}
}
