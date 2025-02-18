package Automation.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PickerChecker {

    ChromeDriver driver;
    String url = "https://stage-dispatch.truemeds.in/";

    public void Openbrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(url);
        Thread.sleep(4000);

    }

    public void Signin() throws InterruptedException {
        WebElement email = driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiInput-input'])[1]"));
        email.click();
        email.sendKeys("prasad.sartape@truemeds.in");

        WebElement password = driver.findElement(By.xpath("(//input[@class='MuiInputBase-input MuiInput-input'])[2]"));
        password.click();
        password.sendKeys("Truemeds@2023");

        WebElement sign = driver.findElement(By.xpath("//span[text()='Sign in']"));
        sign.click();
        Thread.sleep(2000);

        WebElement toggle = driver.findElement(By.xpath("//span[@class='ant-switch-inner']"));
        toggle.click();

    }

    public static void main(String[] args) throws InterruptedException {
        PickerChecker pc = new PickerChecker();
        pc.Openbrowser();
        pc.Signin();
    }


}
