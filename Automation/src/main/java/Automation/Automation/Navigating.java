package Automation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigating {
	
	ChromeDriver driver;
	String url = "https://www.saucedemo.com/";
	
	
	public void invokeBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		WebElement usernameelement = driver.findElement(By.name("user-name"));
		usernameelement.sendKeys("visual_user");
		WebElement passwordelement = driver.findElement(By.name("password"));
		passwordelement.sendKeys("secret_sauce");
		WebElement Login = driver.findElement(By.name("login-button"));
		Login.click();
		
		
	}
	
	public void Adding() throws InterruptedException {
		
		WebElement item = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		item.click();
		Thread.sleep(3000);
		
		WebElement item2 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
		item2.click();
		Thread.sleep(3000);
	}
	
	public void Cart() {
		WebElement gotocart = driver.findElement(By.className("shopping_cart_link"));
		gotocart.click();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Navigating ng = new Navigating();
		ng.invokeBrowser();
		ng.Adding();
		ng.Cart();
	}

}
