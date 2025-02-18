package Automation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Login {
	ChromeDriver driver;
	String url = "https://practicetestautomation.com/practice-test-login/";
	
	public void invokeBrowser() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get(url);
		
	}
	
	public void login() throws InterruptedException {
		WebElement usernameElement = driver.findElement(By.name("username")); // Webelement is an interface and usernameelement is an variable created for it
		usernameElement.sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		Thread.sleep(5000);
	}
	

	
//	public static void main(String[] args) throws InterruptedException {
//		Login lg  = new Login();
//		lg.invokeBrowser();
//		lg.login();
//		lg.logout();
//	}

}
