package ex04_Selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestSelenium08 {

  /*  Open Amazon site

    Search for mobiles

    Scroll twice (to load more products)

    Capture the XPath of the 7th listed mobile (should work even if the DOM reloads or opens in a new tab).
*/
    @Test
    public void AmazonMobiles() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1. Open Amazon
        driver.get("https://www.amazon.in/");

        //2 search  for mobile
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
        driver.findElement(By.id("nav-search-submit-button")).click();

        //3 scroll twice
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for(int i=0;i<2;i++){
            js.executeScript("window.scrollBy(0,1000)");
            Thread.sleep(2000);
        }

        //4 get the 7th list of mobile number
        List<WebElement> mobiles = driver.findElements(By.xpath("//div[@data-component-type='s-search-result']"));
        if(mobiles.size() >= 7){
            WebElement seventhMobile = mobiles.get(6); //index 6 =7th element
            System.out.println("7th mobiles text: "+seventhMobile.getText());

            //Generic xpath  for 7th mobile
            String xpath ="(//div[@data-component-type='s-search-result'])[7]";
            System.out.println("Generic xpath: "+xpath);
        } else {
            System.out.println("less  then 7 mobiles loaded on the page");
        }
        driver.quit();

    }
}
