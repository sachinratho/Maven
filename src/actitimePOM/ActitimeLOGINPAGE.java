package actitimePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeLOGINPAGE {
	
	
	//------Declearation
	
private WebElement	UN;
private WebElement	password;
private WebElement	loginbutton;
WebDriver driver;

//----INItialiazation
public ActitimeLOGINPAGE(WebDriver driver){
	this.driver=driver;
	UN=driver.findElement(By.id("username"));
	
	password=driver.findElement(By.xpath("//input[@name='pwd']"));
	
	loginbutton=driver.findElement(By.id("loginButton"));

}

//----USAGE
public void setActitimeloginpageusername() {
	UN.sendKeys("admin");
	
	
}
public void setActitimeloginpagepassword() {
	password.sendKeys("manager");

	
}
public void setActitimeloginpageloginbutton() {
	loginbutton.click();
	
	
}
}

