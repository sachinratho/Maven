package automation;

public interface CommenProperties {
	String key1 = "webdriver.chrome.driver";
	String key2="webdriver.gecko.driver";
	String value1= "webdriver.chrome.driver";
	String value2= "D:\\firefox\\geckodriver.exe\\";
	public void StratBrowser();
	public void launchChromeBrowser();
	public void launchfirefoxBrowser();
	public void endBrowser();
}
