package actitimePF;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomepage {
	
	@FindBy(xpath="//img[@height='61']")
	private WebElement	logo;
	
	
	@FindBy(className="logout")
	

	private WebElement	logoutbutton;
	WebDriver driver;


	//initialization
	 public ActitimeHomepage(WebDriver driver){
		PageFactory.initElements(driver, this);
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


