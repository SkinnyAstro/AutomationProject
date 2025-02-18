package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


 class MakeMyTrip {
	ChromeDriver driver;
	String url = "https://www.MakeMyTrip.com";





	@Test
	public void InvokeBrowser(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);

	}




	@Test
	public void Mousehover() throws InterruptedException{
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		Thread.sleep(1000);

		WebElement Flights = driver.findElement(By.xpath("//span[@class='headerIconTextAlignment chNavText darkGreyText' and text()='Flights']"));
		Actions action4 = new Actions(driver);
		action4.moveToElement(Flights).click().build().perform();
		Thread.sleep(2000);

		WebElement roundtrip = driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[2]"));
		Actions round = new Actions(driver);
		round.moveToElement(roundtrip).click().build().perform();
		Thread.sleep(2000);

		WebElement JourneyFrom = driver.findElement(By.xpath("//span[@class='lbl_input appendBottom10' and text()='From']"));
		Actions from = new Actions(driver);
		from.moveToElement(JourneyFrom).click().build().perform();
		Thread.sleep(1000);

		WebElement mumbai = driver.findElement(By.xpath("//p[@class='font14 appendBottom5 blackText' and text()='Mumbai, India']"));
		Actions mum = new Actions(driver);
		mum.moveToElement(mumbai).click().build().perform();

		WebElement JourneyTo = driver.findElement(By.xpath("//span[@class='lbl_input appendBottom10' and text()='To']"));
		Actions To = new Actions(driver);
		To.moveToElement(JourneyTo).click().build().perform();
		Thread.sleep(2000);

		WebElement Benglaru = driver.findElement(By.xpath("//p[@class='font14 appendBottom5 blackText' and text()='Bengaluru, India']"));
		Actions Beng = new Actions(driver);
		Beng.moveToElement(Benglaru).click().build().perform();
		Thread.sleep(2000);


	}




	@Test
	public void journeydate() throws InterruptedException{
		WebElement DateFrom = driver.findElement(By.xpath("(//p[text()='29'])[2]"));
		Actions StartDate = new Actions(driver);
		StartDate.moveToElement(DateFrom).click().build().perform();
		Thread.sleep(2000);

		WebElement DateTo = driver.findElement(By.xpath("(//p[text()='1'])[3]"));
		Actions EndDate = new Actions(driver);
		EndDate.moveToElement(DateTo).click().build().perform();
		Thread.sleep(2000);

	}




	@Test
	public void travelling() throws InterruptedException{
			WebElement Traveller = driver.findElement(By.xpath("//span[@class='lbl_input appendBottom5']"));
			Actions Trav = new Actions(driver);
			Trav.moveToElement(Traveller).click().build().perform();
			Thread.sleep(2000);

			WebElement Adults = driver.findElement(By.xpath("//ul[@class='guestCounter font12 darkText gbCounter']/li[@data-cy='adults-3']"));
			Actions Adul = new Actions(driver);
			Adul.moveToElement(Adults).click().build().perform();
			Thread.sleep(2000);

			WebElement Childrens = driver.findElement(By.xpath("//ul[@class='guestCounter font12 darkText gbCounter']/li[@data-cy='children-2']"));
			Actions child = new Actions(driver);
			child.moveToElement(Childrens).click().build().perform();
			Thread.sleep(2000);


		}



		@Test
		public void seating() throws InterruptedException{
				WebElement Firstclass = driver.findElement(By.xpath("//ul[@class='guestCounter classSelect font12 darkText']/li[@data-cy='travelClass-3']"));
				Actions FC = new Actions(driver);
				FC.moveToElement(Firstclass).click().build().perform();
				Thread.sleep(2000);

				WebElement Apply = driver.findElement(By.xpath("//div[@class='right makeFlex hrtlCenter']/button[@data-cy='travellerApplyBtn']"));
				Actions App = new Actions(driver);
				App.moveToElement(Apply).click().build().perform();
				Thread.sleep(2000);

				WebElement Search = driver.findElement(By.xpath("//p[@class='makeFlex vrtlCenter ']/a[@class='primaryBtn font24 latoBold widgetSearchBtn ']"));
				Actions src = new Actions(driver);
				src.moveToElement(Search).click().build().perform();
				Thread.sleep(5000);

			}










			@Test
			public static void main(String[] args) throws InterruptedException{
					MakeMyTrip MT = new MakeMyTrip();
					MT.InvokeBrowser();
					MT.Mousehover();
					MT.journeydate();
					MT.travelling();
					MT.seating();


				}
				}







	



