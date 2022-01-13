package automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TAKEScreenShot {
	

	public void SS() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver b= new ChromeDriver();
		b.manage().deleteAllCookies();
		b.manage().window().maximize();
		b.navigate().to("https://www.facebook.com/");
	//   File s = ((TakesScreenshot)b).getScreenshotAs(OutputType.FILE);
	//	String path = "D:\\AUTOMATION SCreenShot//defect1.png";
	// File f= new File(path);
	// FileHandler.copy(s, f);
//		File S = ((TakesScreenshot)b).getScreenshotAs(OutputType.FILE);
//		String path = "D:\\AUTOMATION SCreenShot//defect1.png";
//		File f = new File(path);
//		FileHandler.copy(S,f);
//		b.close();
		
		
		TakesScreenshot SS = ((TakesScreenshot)b);
		
	File  s=SS.getScreenshotAs(OutputType.FILE);
	String path =  "D:\\AUTOMATION SCreenShot\\defect2.png";
	File f = new File(path);
	FileHandler.copy(s, f);
	
	
	
	}
	
	
	public static void main (String [] args ) throws IOException {
		TAKEScreenShot n = new TAKEScreenShot();
		n.SS();
		
	}

}
