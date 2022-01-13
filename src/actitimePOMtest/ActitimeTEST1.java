package actitimePOMtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actitimePOM.ActitimeHOMEPAGE;
import actitimePOM.ActitimeLOGINPAGE;

public class ActitimeTEST1 {
public static void main(String [] args) {
	

	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.navigate().to("http://localhost/login.do");	
	
	ActitimeLOGINPAGE act= new ActitimeLOGINPAGE(driver);
	act.setActitimeloginpageusername();
	act.setActitimeloginpagepassword();
	act.setActitimeloginpageloginbutton();
	
	ActitimeHOMEPAGE act1= new ActitimeHOMEPAGE(driver);
	act1.verifyactimepagelogo();
	act1.actimepagelogoutbutton();
}
}
