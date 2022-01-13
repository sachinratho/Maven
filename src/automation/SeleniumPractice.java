package automation;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {

	WebDriver D;
	public void WH() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
	
	D=new ChromeDriver();
	D.get("https://www.naukri.com/");
	
	D.manage().window().maximize();
	D.manage().deleteAllCookies();

	String ParentID = D.getWindowHandle();
	System.out.println("parent id window is ="+ParentID);
   Set<String> ChildID = D.getWindowHandles();
	System.out.println("parent plus childid's is ="+ChildID);
	
	for(String S: ChildID) {
		if(!ParentID.equals(S)) {
			D.switchTo().window(S);
			System.out.println(D.getTitle());
			D.close();
		}
	}
	D.switchTo().window(ParentID);
	D.close();
	
	}
	public static void main(String [] args ) {
		
		SeleniumPractice o = new SeleniumPractice();
		o.WH();
		
	}
}
