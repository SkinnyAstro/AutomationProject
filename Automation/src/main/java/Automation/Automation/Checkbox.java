
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Checkbox {

    ChromeDriver driver;
    String url = "https://www.tutorialrepublic.com/codelab.php?file=checkboxes-and-radio&topic=html";


    public void InvokeBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.get(url);
    }

    public  void checkbox(){
        WebElement sports = driver.findElement(By.xpath("//input[@id='sport']"));
        sports.click();

        WebElement music= driver.findElement(By.xpath("//input[@id='music']"));
        music.click();

        WebElement Reading = driver.findElement(By.xpath("//input[@id='read']"));
        Reading.click();

    }

    public static void main(String[] args) {
        Checkbox cb = new Checkbox();
        cb.InvokeBrowser();
        cb.checkbox();
    }

}

