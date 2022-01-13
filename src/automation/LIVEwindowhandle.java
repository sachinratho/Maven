package automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LIVEwindowhandle {
	
	public void WH1() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();	
		d.navigate().to("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
        WebElement UN = d.findElement(By.xpath("//a[@target='_blank']"));
     	UN.click();
     	 String parentid=d.getWindowHandle();
		 System.out.println("this is parent id =" +parentid);
		 Set<String> childid =d.getWindowHandles();
           System.out.println("this is parent id =" +parentid);
		   for(String s : childid) {
			   if(!parentid.equals(s)){
				   d.switchTo().window(s);
				   d.close();
     	
   	String PARENTID = d.getWindowHandle();
    	System.out.println("parent id is ="+PARENTID);
   Set<String> CHILDID = d.getWindowHandles();
   System.out.println("child window is ="+CHILDID);
   for(String F:CHILDID) {
	   if(!PARENTID.equals(F)) {
		   
	   d.switchTo().window(F);
	   }
   }
	WebElement mn = d.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	mn.sendKeys("pune");
	mn.submit();
	
	d.switchTo().window(PARENTID);
	WebElement bb = d.findElement(By.xpath("//a[@href='http://seleniumpractise.blogspot.com/2021/']"));
	bb.click();
	System.out.println("ek number sachin bhau");
	
	
	}
	public static void main (String [] args ) {
		LIVEwindowhandle b = new LIVEwindowhandle();
		b.WH1();
	}

}
