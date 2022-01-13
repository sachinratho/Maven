package automation;


import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollUpanddown {




	public void SUPDN() throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("http://demo.guru99.com/test/guru99home/");
		// SCREENSHOT
		File S = ((  TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		String path = "D:\\ss/defect1.png";
		File f= new File(path);

		FileHandler.copy(S,f);
		//SCROLL UP AND downS 

		//		//JavascriptExecutor j = ( (JavascriptExecutor)d);
		//	  JavascriptExecutor  j=  ((JavascriptExecutor)d);
		//	  Thread.sleep(3000);
		//	  j.executeScript("scroll(0,1200)");
		//	  Thread.sleep(2000);
		//	  j.executeScript("scroll(0,-1200)");
		//	  j.executeScript("scroll(400, 0)");
	}



	public static void main (String [] args ) throws InterruptedException, IOException {
		ScrollUpanddown b = new ScrollUpanddown();
		b.SUPDN();
	}
}
