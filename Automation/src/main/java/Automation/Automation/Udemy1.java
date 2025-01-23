package Automation.Automation;

import org.apache.hc.client5.http.impl.classic.MainClientExec;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Udemy1 {
	
	ChromeDriver driver;
	String url = "https://finance.yahoo.com/";
	String url2 = "https://www.facebook.com";
	
public void OpenChrome() {
	
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.get(url);
	   driver.manage().window().maximize();
	   String ExpectedTitle = "Yahoo Finance - Stock Market Live, Quotes, Business & Finance News";
	   String ActualTitle = "";
	    
	   if (ActualTitle.contentEquals(ExpectedTitle)) {
		   System.out.println("PASS");
		
	}else {
		System.out.println("FAIL");
	}
	   
	   driver.get(url2);
	   driver.navigate().back();
	   String currenturl = driver.getCurrentUrl();
	   System.out.println("Current url "+ currenturl);
       
	   driver.navigate().forward();
	   driver.navigate().refresh();
	   driver.close();
	   
	   	   
}
 
public static void main(String[] args) {
     Udemy1 ud = new Udemy1();
     ud.OpenChrome();
}

}

	
