package automation;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WINDOWhandeling {
	
	private static Set<String> cid;

	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.navigate().to("https://www.naukri.com/");
		String parentid = d.getWindowHandle();
		System.out.println("this is parent is id ="+ parentid);
		Set<String> childid = d.getWindowHandles();
		System.out.println("this is childid ="+childid);
		
		
		for(String s: childid) {
			
			if (!parentid.equals(s)) {
				
				d.switchTo().window(s);
				System.out.println("ids"+d.getTitle());
				Thread.sleep(2000);
				d.close();
			}
		}
		d.switchTo().window(parentid);
		d.close();
		
		
		

	String 	parentid1=d.getWindowHandle();
	System.out.println(" this is parentid");
    Set<String>childdddid=d.getWindowHandles();
    System.out.println("this is child id ");
    
    
    
    
    for(String  s : childdddid ) {
    	if(!parentid1.equals(s)) {
    		d.switchTo().window(s);
    		d.close();
    	}
    	d.switchTo().window(parentid1);
    	d.close();
    	
    }
		
		
		
		
		
		
		
//		String parent = d.getWindowHandle();
//		
//		Set<String> childP = d.getWindowHandles();
//		
//		
//		for(String child : childP)
//		{
//			if(!parent.equals(child))
//			{
//				d.switchTo().window(child);
//				System.out.println(d.getTitle());
//				d.close();
//			}
//		}
//		d.quit();
////		d.switchTo().window(parent);
////		d.close();
//		
//		
//		
//		
	}
}
