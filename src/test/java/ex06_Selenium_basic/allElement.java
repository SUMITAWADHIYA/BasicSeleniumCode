package ex06_Selenium_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class allElement {
    public WebDriver driver;
    //open to flipkart then search to 5g mobile  all list get to phone in first page
    @BeforeClass
    public void set(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void flipkart(){
        //set first open the flipkart
        driver.get("https://flipkart.com/");

        try {
            WebElement closeBtn = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
            closeBtn.click();
        } catch (Exception e) {
           // throw new RuntimeException(e);
            System.out.println("Login popup not displayed.");
        }
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("5g mobile");
        searchbox.submit();

        List<WebElement> mobiles = driver.findElements(By.xpath("//div[@class='tUxRFH']"));
        System.out.println("Mobiles found on first page:");
        for(WebElement mobile:mobiles){
            System.out.println(" list of mobile: "+mobile.getText());
        }
        System.out.println("Total mobiles on first page: " + mobiles.size());
    }

}
