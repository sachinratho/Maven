package actitimePF;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLOGINpage {
	
	//------Declearation
@FindBy(id="username")
private WebElement	UN;

@FindBy(xpath="//input[@name='pwd']")
private WebElement	password;

@FindBy(id="loginButton")
private WebElement	loginbutton;
WebDriver driver;

//----INItialiazation
public ActitimeLOGINpage(WebDriver driver){
	PageFactory.initElements( driver, this);
	
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
