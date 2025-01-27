package Automation.Automation;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {
	
	ChromeDriver driver;
	String url = "https://www.MakeMyTrip.com";
	
	public void InvokeBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		
	}
	
	public void Mousehover() throws InterruptedException {
		  driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		  WebElement Hotels = driver.findElement(By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText' and text()='Hotels']"));
		  Actions action = new Actions(driver);
		  action.moveToElement(Hotels).click().build().perform();
		  Thread.sleep(2000);
		  WebElement Homestaysandvilla = driver.findElement(By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText' and text()='Homestays & Villas']"));
		  Actions action1 = new Actions(driver);
		  action1.moveToElement(Homestaysandvilla).click().build().perform();
		  Thread.sleep(2000);
		  WebElement HolidayPackages = driver.findElement(By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText' and text()='Holiday Packages']"));
		  Actions action2 = new Actions(driver);
		  action2.moveToElement(HolidayPackages).click().build().perform();
		  Thread.sleep(2000);
		  WebElement Honeymoon = driver.findElement(By.xpath("//span[text()='Honeymoon'  ]"));
		  Actions action3 = new Actions(driver);
		  action3.moveToElement(Honeymoon).click().build().perform();

}
	
	public static void main(String[] args) throws InterruptedException {
		MakeMyTrip MT = new MakeMyTrip();
		MT.InvokeBrowser();
		MT.Mousehover();
	}
	
}
