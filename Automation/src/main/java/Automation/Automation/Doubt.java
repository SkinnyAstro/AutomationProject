package Automation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Doubt {

    ChromeDriver driver;
    String url = "https://staging-web.truemeds.in/";


    public void browser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(url);
        Thread.sleep(4000);

    }


    public void login() throws InterruptedException {
        WebElement icon = driver.findElement(By.xpath("//button[@class='sc-b7e936f3-0 sc-5c16eb5d-0 dOqDEV fEYuDN' and text()='Login / Signup']"));
        icon.click();

        WebElement mobileno = driver.findElement(By.id("phone"));
        mobileno.click();
        mobileno.sendKeys("8850843264");

        WebElement otp = driver.findElement(By.xpath("//button[@class='sc-b7e936f3-0 sc-c5c26131-0 dOqDEV bHIGnk sc-1e8ac7c1-9 bMwxkY']"));
        otp.click();
        Thread.sleep(15000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='No thanks']")));
        WebElement popup = driver.findElement(By.xpath("//button[@class='No thanks']"));
        popup.click();
        Thread.sleep(2000);


    }

    public void Search() throws InterruptedException {

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchbar;
        searchbar  = driver.findElement(By.id("searchInput"));
        searchbar.click();
        searchbar.sendKeys("adrole 1 mg tablet 10");

        WebElement Searchbutton = driver.findElement(By.xpath("//button[@class='sc-88fa98dc-1 lljRmt']"));
        Searchbutton.click();

    }


    public void addingsku() throws InterruptedException {

        WebElement addbuutton = driver.findElement(By.xpath("//button[@class='sc-b7e936f3-0 sc-c5c26131-0 dOqDEV bHIGnk sc-1f10bda2-1 kaaNth']"));
        addbuutton.click();

        WebElement proceedtocart = driver.findElement(By.xpath("//button[text()='Proceed to Cart ']"));
        proceedtocart.click();
        Thread.sleep(4000);
    }

    public void cartpage() throws InterruptedException {
        WebElement addressbutton = driver.findElement(By.xpath("//button[text()='Add Address']"));
        addressbutton.click();

        WebElement pinocde = driver.findElement(By.name("pincode"));
        pinocde.sendKeys("400079");
        Thread.sleep(2000);

        WebElement Houseno = driver.findElement(By.name("addressLine1"));
        Houseno.sendKeys("Test Address");
        Thread.sleep(3000);

        WebElement locality = driver.findElement(By.name("addressLine2"));
        locality.sendKeys("Opposite Axis bank");
        Thread.sleep(2000);

        WebElement type = driver.findElement(By.name("Home"));
        type.click();

        WebElement savecontinue = driver.findElement(By.xpath("//button[@class='sc-b7e936f3-0 sc-c5c26131-0 dOqDEV bHIGnk']"));
        savecontinue.click();

    }

    public static void main(String[] args) throws InterruptedException {
        Doubt nu = new Doubt();
        nu.browser();
        nu.login();
        nu.Search();
        nu.addingsku();
        nu.cartpage();
    }



}
