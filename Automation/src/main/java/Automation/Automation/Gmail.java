package Automation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {
	ChromeDriver driver;
	String url = "https://workspace.google.com/intl/en-US/gmail/";
	
	
	public void invokeBrowser() {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get(url);
		
	}
	
	public void login() {
		WebElement usernameElement = driver.findElement(By.className("button__label")); // Webelement is an interface and usernameelement is an variable created for it
		usernameElement.click();
		driver.findElement(By.name("identifier")).sendKeys("sartapeprasad@gmail.com");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		driver.findElement(By.name("Passwd")).sendKeys("Kylian30#");
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		
	}
	public static void main(String[] args) {
		Gmail gl = new Gmail();
		gl.invokeBrowser();
		gl.login();
	}
	

}
