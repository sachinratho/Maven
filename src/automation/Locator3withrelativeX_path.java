package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3withrelativeX_path {
	
	void relativepaths() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.navigate().to("file:///D:/notepad/velocity.html");
		d.manage().window().maximize();
		
		//1..RELATIVE X-PATH (NORMAL/REGULAR)-----std.syntax--//tagname  
	//(by-default it will take first always)
		WebElement nn = d.findElement(By.xpath("//input"));
		nn.sendKeys("sachin@123");
		
		//2..RELATIVE X-PATH by index-----std.syntax--//tagname[index]  
		//(it will take tagname which we call in index, suppose we write [3] then it will redirect t0 3rd input)
		
	WebElement q = d.findElement(By.xpath("//input[3]"));
	q.sendKeys("sachin@993");
	
	//3..relative x-path by index using signature
	//std.stx.----//(div//tagname)[index]
	WebElement u = d.findElement(By.xpath("(//div//input)[7]"));
	u.click();
	//4..RELATIVE X-PATH BY  ATTRIBUTE
	//std.stx.---//tagname[@Atributename='atribute value']
	WebElement w = d.findElement(By.xpath("//input[@id='c1']"));
	w.click();
	
	//5..RELATIVE X-PATH BY TEXT FUNCTION 
	//std.stx.----//tagname[text()='textvalue'
//WebElement o = d.findElement(By.xpath("//a[text()='Forgotton Account?']"));
//	o.click();
	//d.navigate().forward();
	//6..RELATIVE X-PATH BY CONTAINS FOR ATTRIBUTE  
	//std.stx.---//tagname[contains@atributename,'atributevalue'
	WebElement v = d.findElement(By.xpath("//input[contains(@name,'pwd')]"));
	v.sendKeys("9158683662");
	
	//7.RELATIVE X-PATH BY CONTAINS FOR TEXT FUNCTION
	//STD.stx.----//tagname[contains(text(),'textvalue')]
WebElement t = d.findElement(By.xpath("//a[contains(text(),'Forgotton Account?')]"));
t.click();

	
	
	
	
	
	
	}
	public static void main (String [] args ) {
		Locator3withrelativeX_path n = new Locator3withrelativeX_path();
		n.relativepaths();
		
		
	}

}
