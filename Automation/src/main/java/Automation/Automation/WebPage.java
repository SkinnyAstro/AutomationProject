package Automation.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebPage {
	
	public static void main(String[] args) {
		
	
//	System.setProperty("webdriver.gecko.driver","\"C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\"");
   WebDriverManager.chromedriver().setup();
   //WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new ChromeDriver();
	
    //comment the above 2 lines and uncomment below 2 lines to use Chrome
    //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
    //WebDriver driver = new ChromeDriver();

    String baseUrl = "https://www.makemytrip.com/hotels/";
    String expectedTitle = "Make my Trips";
    String actualTitle = "";

    // launch Fire fox and direct it to the Base URL
    driver.get(baseUrl);

    // get the actual value of the title
    actualTitle = driver.getTitle();
    driver.manage().window().maximize();

    /*
     * compare the actual title of the page with the expected one and print
     * the result as "Passed" or "Failed"
     */
    if (actualTitle.contentEquals(expectedTitle)){
        System.out.println("Test Passed!");
    } else {
        System.out.println("Test Failed");
    }

    //close Fire fox
    driver.close();
}
}
