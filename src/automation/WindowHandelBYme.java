package automation;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandelBYme {

	//public void wH() {
	//		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
	//		WebDriver d = new ChromeDriver();
	//		d.manage().window().maximize();
	//	d.navigate().to("https://www.naukri.com/");
	//		
	//		String parentiD = d.getWindowHandle();
	//		System.out.println( "main window id is ="+parentiD);
	//		Set<String> chinlID = d.getWindowHandles();
	//		System.out.println("child window id is ="+chinlID);
	//		

	//s}
	public  static void main (String [] args ) {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.naukri.com/");

		String parentiD = d.getWindowHandle();
		System.out.println( "main window id is ="+parentiD);
		Set<String> chinlID = d.getWindowHandles();
		System.out.println("child window id is ="+chinlID);

		for(String S: chinlID) {
			if(!parentiD.equals(S)) {
				d.switchTo().window(S);
				System.out.println("child window tittle is ="+ d.getTitle());
				d.close();
			}
		}

	}

}
