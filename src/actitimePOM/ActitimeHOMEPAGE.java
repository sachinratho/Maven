package actitimePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeHOMEPAGE {
//declearation


private WebElement	logo;

private WebElement	logoutbutton;
WebDriver driver;


//initialization
 public ActitimeHOMEPAGE(WebDriver driver){
	this .driver=driver;
	logo=driver.findElement(By.xpath("//img[@height='61']"));
logoutbutton=driver.findElement(By.className("logout"));
 }
//USAGE
public void verifyactimepagelogo() {
	boolean res = logo.isDisplayed();
	if(res==true) {
		
		System.out.println("logo is displayed");
	}else {
		System.out.println("logo is not displayed");
	}
		
}

public void actimepagelogoutbutton() {
	logoutbutton.click();
	
}
}
