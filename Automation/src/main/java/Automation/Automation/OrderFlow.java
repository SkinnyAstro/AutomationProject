package Automation.Automation;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class OrderFlow {
    ChromeDriver driver;
    String url = "https://staging-web.truemeds.in/";

    public void browser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
        searchbar = driver.findElement(By.id("searchInput"));
        searchbar.click();
        searchbar.sendKeys("adrole 1 mg tablet 10");

        WebElement Searchbutton = driver.findElement(By.xpath("//button[@class='sc-88fa98dc-1 lljRmt']"));
        Searchbutton.click();

    }

    public void addingsku() throws InterruptedException {

        WebElement addbuutton = driver.findElement(By.xpath("//button[@class='sc-b7e936f3-0 sc-c5c26131-0 dOqDEV bHIGnk sc-1f10bda2-1 kaaNth']"));
        addbuutton.click();
        Thread.sleep(2000);

        WebElement proceedtocart = driver.findElement(By.xpath("//button[text()='Proceed to Cart ']"));
        proceedtocart.click();
        Thread.sleep(4000);
    }

    public void cartpage() {

        By addAddressBtn = By.xpath("//button[text()='Add Address']");
        By addDeliverydetails = By.xpath("//button[text() = 'Add Delivery Details']");
        By proccedTocheckout = By.xpath("//button[text() = 'Proceed to Checkout']");
        By addPesonaldetails = By.xpath("//button[text()='Add personal details']");
        By addAddress = By.xpath("//button[text()='Add Address']");
        By saveAndContinue = By.xpath("//button[@class='sc-b7e936f3-0 sc-c5c26131-0 dOqDEV bHIGnk' and text()='Save & Continue']");

        try {

            if (isElementVisible(driver, addAddressBtn)) {
                System.out.println("Add address button is visible");
                driver.findElement(addAddressBtn).click();

                WebElement pincode = driver.findElement(By.name("pincode"));
                pincode.click();
                pincode.sendKeys("400079");
                Thread.sleep(2000);

                WebElement Houseno = driver.findElement(By.name("addressLine1"));
                Houseno.click();
                Houseno.sendKeys("Test Addresss");
                Thread.sleep(2000);

                WebElement streetLocality = driver.findElement(By.name("addressLine2"));
                streetLocality.click();
                streetLocality.sendKeys("Opposite Axis Bank");
                Thread.sleep(2000);

                WebElement addressType = driver.findElement(By.xpath("//button[text()='Home']"));
                addressType.click();

                driver.findElement(saveAndContinue).click();
                Thread.sleep(5000);

                WebElement name = driver.findElement(By.name("customerFullName"));
                name.click();
                name.sendKeys("Prasad");
                Thread.sleep(2000);

                WebElement age = driver.findElement(By.name("customerAge"));
                age.click();
                age.sendKeys("74");
                Thread.sleep(2000);

                WebElement gender = driver.findElement(By.xpath("(//div[@class='sc-886e34e-3 bdRRhj radioInnerselect'])[1]"));
                gender.click();
                Thread.sleep(1000);

                driver.findElement(saveAndContinue).click();
                Thread.sleep(5000);

                driver.findElement(proccedTocheckout).click();

            } else if (isElementVisible(driver,proccedTocheckout)) {
                System.out.println("Proceed to checkout is visible");
                driver.findElement(proccedTocheckout).click();
            } else if (isElementVisible(driver,addDeliverydetails)) {
                System.out.println("Add delivery details button is visible");
                driver.findElement(addDeliverydetails).click();

                if (isElementVisible(driver,addPesonaldetails)){
                    System.out.println("Pesonal details need to be added");
                    driver.findElement(addPesonaldetails).click();
                    WebElement name = driver.findElement(By.name("customerFullName"));
                    name.click();
                    name.sendKeys("Prasad");
                    Thread.sleep(2000);

                    WebElement age = driver.findElement(By.name("customerAge"));
                    age.click();
                    age.sendKeys("74");
                    Thread.sleep(2000);

                    WebElement gender = driver.findElement(By.xpath("(//div[@class='sc-886e34e-3 bdRRhj radioInnerselect'])[1]"));
                    gender.click();
                    Thread.sleep(1000);

                    driver.findElement(saveAndContinue).click();
                    Thread.sleep(5000);

                } else if (isElementVisible(driver,addAddress)) {

                    System.out.println("Address details need to be added");
                    driver.findElement(addAddress).click();
                    WebElement pincode = driver.findElement(By.name("pincode"));
                    pincode.click();
                    pincode.sendKeys("400079");
                    Thread.sleep(2000);

                    WebElement Houseno = driver.findElement(By.name("addressLine1"));
                    Houseno.click();
                    Houseno.sendKeys("Test Addresss");
                    Thread.sleep(2000);

                    WebElement streetLocality = driver.findElement(By.name("addressLine2"));
                    streetLocality.click();
                    streetLocality.sendKeys("Opposite Axis Bank");
                    Thread.sleep(2000);

                    WebElement addressType = driver.findElement(By.xpath("//button[text()='Home']"));
                    addressType.click();

                    driver.findElement(saveAndContinue).click();
                    Thread.sleep(5000);
                }

                else {
                    System.out.println("Need to select an address");
                    WebElement radiobtn = driver.findElement(By.xpath("//div[@class='check-circle ']"));
                    radiobtn.click();
                    Thread.sleep(2000);
                    driver.findElement(saveAndContinue).click();
                    Thread.sleep(5000);
                    driver.findElement(proccedTocheckout).click();

                }

            }
            else {
                System.out.println("Expected button not found");
            }

        } catch (Exception e) {

        }


    }

    public void summarypage(){
        By SelectPaymentmode = By.xpath("//button[text()='Select payment mode']");
        //By placeOrder = By.xpath("//p[text()='Place order']");
        try {

            if (isElementVisible(driver,SelectPaymentmode)){
                System.out.println("Select payment mode button is visible");
                driver.findElement(SelectPaymentmode).click();
                Thread.sleep(2000);
                driver.findElement(By.xpath("//div[text()='UPI']")).click();
                driver.findElement(By.xpath("//button[@class='sc-c25b8411-0 MwlZG' and text()='Place order']")).click();


            }else {
                System.out.println("Place order button is visible");
                driver.findElement(By.xpath("//button[@class='sc-c25b8411-0 MwlZG' and text()='Place order']")).click();

            }

        } catch (Exception e){

        }
    }

    public boolean isElementVisible(WebDriver driver, By locator) {
        try {
            WebElement element = driver.findElement(locator);
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        OrderFlow of = new OrderFlow();
        of.browser();
        of.login();
        of.Search();
        of.addingsku();
        of.cartpage();
        of.summarypage();
    }


}
