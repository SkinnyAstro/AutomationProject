package Automation.Automation;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowser {
	
	ChromeDriver driver;
	String url = "https://www.google.com";
	
	public void OpenChrome() throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	
	}
	
	public void CloseChrome() {
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		OpenBrowser OB = new OpenBrowser();
		OB.OpenChrome();
		OB.CloseChrome();
		
	}
	
}
  